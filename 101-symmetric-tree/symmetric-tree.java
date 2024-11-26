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
        return isSymmetric(root, root);
    }

    public boolean isSymmetric(TreeNode lroot, TreeNode rroot){
        if(lroot == null && rroot == null) return true;
        else if (lroot == null || rroot == null) return false;
        else return lroot.val == rroot.val && isSymmetric(lroot.left, rroot.right) && isSymmetric(lroot.right, rroot.left);
    }
}