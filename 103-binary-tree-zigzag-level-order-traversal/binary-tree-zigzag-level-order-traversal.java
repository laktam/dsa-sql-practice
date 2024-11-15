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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;
        Stack<TreeNode> toDo = new Stack<>();
        toDo.push(root);
        int i = 0;
        while(!toDo.isEmpty()){
            Stack<TreeNode> toDoNext = new Stack<>();
            List<Integer> level = new ArrayList<>();
            while(!toDo.isEmpty()){
                TreeNode current = toDo.pop();
                level.add(current.val);
                if(i % 2 == 0){
                    if(current.left != null) toDoNext.push(current.left);
                    if(current.right != null) toDoNext.push(current.right);
                }else{
                    if(current.right != null) toDoNext.push(current.right);
                    if(current.left != null) toDoNext.push(current.left);
                } 
            }
            result.add(level);
            i++;    
            toDo.clear();
            toDo.addAll(toDoNext);
        }
        return result;
    }
}