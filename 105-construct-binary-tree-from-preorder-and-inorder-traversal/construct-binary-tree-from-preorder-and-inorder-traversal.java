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
    private int n = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return tree(inorder, preorder, 0, inorder.length - 1);
    }
    private TreeNode tree(int[] inorder, int[] preorder, int start, int end){
        if(n >= preorder.length) return null;
        if(start == end) return new TreeNode(inorder[start]);

        TreeNode root = new TreeNode(preorder[n]);
        int rootIndex = 0;
        for(int i = start; i <= end; i++){
            if(inorder[i] == preorder[n]){
                rootIndex = i;
                break;
            }
        }
        if(rootIndex > start){
            n++;
            root.left = tree(inorder, preorder, start, rootIndex - 1);
        }
        if(rootIndex < end){
            n++;
            root.right = tree(inorder, preorder, rootIndex + 1, end);
        }
        return root;
    }
}