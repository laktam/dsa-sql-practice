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
    private List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null) return result;
        List<Integer> l = new ArrayList<>();
        l.add(root.val);
        result.add(l);
        helper(root);
        return result;
    }

    public void helper(TreeNode... nodes){
        List<TreeNode> nextLevel = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        for(TreeNode node : nodes){
            if(node.left != null){
                l.add(node.left.val);
                nextLevel.add(node.left);
            }
            if(node.right != null){
                l.add(node.right.val);
                nextLevel.add(node.right);
            }
        }
        if(!l.isEmpty()){
                result.add(l);
            }
        if(!nextLevel.isEmpty()){
            helper(nextLevel.toArray(new TreeNode[0]));
        }
    }
}