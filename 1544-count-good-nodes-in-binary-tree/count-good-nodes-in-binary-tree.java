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
    public int goodNodes(TreeNode root) {
        int goodNodes = 0;
        
        if(root != null){
            int max = root.val;
            goodNodes = goodNodesInSubTree(root, max);
        }
        return goodNodes;
    }
    public int goodNodesInSubTree(TreeNode root, int max){
        int r = 0;
        if(root.val >= max){
            max = root.val;
            r++;
        }
        int left = 0;
        if(root.left != null){
            left = goodNodesInSubTree(root.left, max);
        }
        int right = 0;
        if(root.right != null){
            right = goodNodesInSubTree(root.right, max);
        }
        return r + right + left;
    }
}