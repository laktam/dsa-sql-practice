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
    public List<Integer> inorderTraversal(TreeNode root) {
        // recursivly

        List<Integer> items = new ArrayList<>();
        if(root == null) return items;
        if(root.left == null && root.right == null) {
            items.add(root.val);
            return items;
        }
        items.addAll(inorderTraversal(root.left));
        items.add(root.val);
        items.addAll(inorderTraversal(root.right));
        return items;
        
        // iterativly
        // List<Integer> items = new ArrayList<>();
        // if(root == null) return items;
        // Stack<TreeNode> stack = new Stack<>();
        // stack.push(root);
        // while(!stack.isEmpty()){// 2 
        //     TreeNode current = stack.pop();
        //     if(current.left == null && current.right == null) {
        //         items.add(current.val);
        //         if(!stack.isEmpty()){
        //             stack.peek().left = null;
        //         }
        //         // current.left = null;
        //     }
        //     else {
        //         if(current.left == null){
        //             items.add(current.val);
        //             // stack.pop();
        //             if(current.right != null){
        //                 stack.push(current.right);
        //             }
        //         }
        //         if(current.left != null ){
        //             stack.push(current);
        //             stack.push(current.left);
        //         }        // 1      7
                
                
        //     }
            
        // }
        // return items;
        
    }
}