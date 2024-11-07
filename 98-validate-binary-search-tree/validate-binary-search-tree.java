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
    private List<TreeNode> list = new ArrayList<>();

    public boolean isValidBST(TreeNode root) {
        if(root == null) return true;
        treeToList(root);
        for(int i = 0; i < list.size() - 1; i++){
            if(list.get(i).val >= list.get(i + 1).val) return false;
        }
        return true;
    }

    public void treeToList(TreeNode root){
        if(root == null) return;
        if(root.left != null) treeToList(root.left);
        list.add(root);
        if(root.right != null) treeToList(root.right);
    }
}