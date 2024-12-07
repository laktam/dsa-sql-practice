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
        return buildTree(preorder, inorder, 0, inorder.length - 1);
    }

    private TreeNode buildTree(int preorder[], int inorder[], int start, int end){
        // if(start == end) return new TreeNode(preorder[start]);
        if(n >= preorder.length) return null;

        TreeNode root = new TreeNode(preorder[n]);
        int rootIndex = 0;
        for(int i = start; i <= end; i++){
            if(inorder[i] == preorder[n]) {
                rootIndex = i;
                break;
            }
        }
        if(rootIndex > start){
            n++;
            root.left = buildTree(preorder, inorder, start, rootIndex - 1);
        }
        if(rootIndex < end){
            n++;
            root.right = buildTree(preorder, inorder, rootIndex + 1, end);
        }
        return root;
    }
}