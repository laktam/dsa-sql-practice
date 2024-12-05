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
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 1;
        else {
            int lmin = 0;
            int rmin = 0;
            if(root.left != null) {
                lmin = minDepth(root.left);
                if(root.right == null) return lmin + 1;
            }
            if(root.right != null){
                rmin = minDepth(root.right);
                if(root.left == null) return rmin + 1;
            }
            return Math.min(rmin, lmin) + 1;
        }
    }
}