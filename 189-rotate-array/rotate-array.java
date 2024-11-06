class Solution {
    public void rotate(int[] nums, int k) {
        int help[] = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            help[(i + k) % nums.length] = nums[i];
        }
        System.arraycopy(help, 0, nums, 0, nums.length);
    }
}