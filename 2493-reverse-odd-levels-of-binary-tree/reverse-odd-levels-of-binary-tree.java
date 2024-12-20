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
    public TreeNode reverseOddLevels(TreeNode root) {
        int levelCount = 0;
        LinkedList<TreeNode> level = new LinkedList<>();
        level.add(root);
        while(!level.isEmpty()){
            int size = level.size();
            if(levelCount % 2 != 0){
                System.out.println("size: " + size);
                int l = 0;
                int r = size - 1;
                while(l < r){
                    int tmp = level.get(l).val;
                    level.get(l).val = level.get(r).val;
                    level.get(r).val = tmp;
                    l++;
                    r--;
                }
            }
            for(int i = 0; i < size; i++){
                TreeNode n = level.remove();
                if(n.left != null){
                    level.add(n.left);
                }
                if(n.right != null){
                    level.add(n.right);       
                }
            }
            levelCount++;
            
        }
        return root;
    }
}