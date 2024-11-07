/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return isSymmetricLevel(root.left, root.right);
    }

    // call with 2
    public boolean isSymmetricLevel(TreeNode... nodes){
        int l = 0;
        int r = nodes.length - 1;
        Deque<TreeNode> deque = new LinkedList<>();
        while(l < r){
            if(nodes[l] == null && nodes[r] != null) return false;
            if(nodes[r] == null && nodes[l] != null) return false;
            if(nodes[r] == null && nodes[l] == null){
                l++;
                r--;
                continue;
            }
            if(nodes[l].val != nodes[r].val) return false;
            // add left elements children to the start
            deque.addFirst(nodes[l].left);
            deque.addFirst(nodes[l].right);
            // add right element children to the end
            deque.addLast(nodes[r].right);
            deque.addLast(nodes[r].left);
            l++;
            r--;
        }
        if(deque.size() == 0) return true;
        return isSymmetricLevel(deque.toArray(new TreeNode[0]));
        // return true;
    }
}