class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];

        int dp[] = new int[nums.length];
        int rob1 = nums[0];
        int rob2 = Math.max(nums[0], nums[1]);
        int max = rob2;
        for(int i = 2; i < nums.length; i++){
            max = Math.max(rob1 + nums[i], rob2);
            rob1 = rob2;
            rob2 = max;
        }
        return max;
    }
}