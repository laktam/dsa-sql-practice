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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> items = new ArrayList<>();
        if(root == null) return items;
        if(root.left == null && root.right == null) {
            items.add(root.val);
            return items;
        }
        items.addAll(inorderTraversal(root.left));
        items.add(root.val);
        items.addAll(inorderTraversal(root.right));
        return items;
    }
}