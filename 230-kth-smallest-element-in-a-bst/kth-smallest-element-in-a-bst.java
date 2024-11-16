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
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        treeToList(root, list);
        return list.get(k - 1);
        
    }

    private void treeToList(TreeNode root, List<Integer> list){
        if(root.left == null && root.right == null){
            list.add(root.val);
            return;
        }else{
            if(root.left != null) treeToList(root.left, list);
            list.add(root.val);
            if(root.right != null) treeToList(root.right, list);
        }
    }
}