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
    private List<TreeNode> inorder = new ArrayList<>();
    public void recoverTree(TreeNode root) {
        inorder(root);
        TreeNode first = null;
        TreeNode second = null;

        int size = inorder.size();
        long prev = Long.MAX_VALUE;

        for(int i = 0; i < size - 1; i++){
            if(inorder.get(i).val > inorder.get(i + 1).val){
                if(first == null){
                    first = inorder.get(i);
                    second = inorder.get(i + 1);
                }
                else{
                    second = inorder.get(i + 1);
                }
            }
        }
        int tmp = first.val;
        first.val = second.val;
        second.val = tmp;
    }

    private void inorder(TreeNode root){
        if(root == null) return;
        inorder(root.left);
        inorder.add(root);
        inorder(root.right);
    }
}