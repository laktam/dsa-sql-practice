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
    public TreeNode sortedArrayToBST(int[] nums) {
        int mid = nums.length / 2;
        TreeNode root = null;
        if(nums.length > 0){
            root = new TreeNode(nums[mid]);
            if(mid > 0){
                root.left = sortedArrayToBST(Arrays.copyOfRange(nums, 0, mid));
            }else{
                root.left = null;
            }

            if(mid + 1 > nums.length){
                root.right = null;
            }else{
                root.right = sortedArrayToBST(Arrays.copyOfRange(nums, mid + 1, nums.length));
            }
        }
        return root;
    }

}