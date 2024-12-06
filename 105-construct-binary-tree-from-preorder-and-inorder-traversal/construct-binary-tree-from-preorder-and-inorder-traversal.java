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
        return tree(inorder, preorder);
    }
    private TreeNode tree(int[] inorder, int[] preorder){
        if(inorder.length == 0 || n >= preorder.length) return null;

        TreeNode root = new TreeNode(preorder[n]);
        int rootIndex = 0;
        for(int i = 0; i< inorder.length; i++){
            if(inorder[i] == preorder[n]){
                rootIndex = i;
                break;
            }
        }
        if(rootIndex != 0){
            int[] left = Arrays.copyOfRange(inorder, 0, rootIndex);
            n++;
            root.left = tree(left, preorder);
        }
        if(rootIndex + 1 < inorder.length){
            int[] right = Arrays.copyOfRange(inorder, rootIndex + 1, inorder.length);
            n++;
            root.right = tree(right, preorder);
        }
        return root;
    }
}