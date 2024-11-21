class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length == 1) return true;
        int jumpsNeeded = nums.length - 1;
        boolean dp[] = new boolean[nums.length];
        for(int i = nums.length - 2; i >= 0; i--){
            // maybe change >= if we need to be exactly at the last index
            if(i + nums[i] >= nums.length - 1) dp[i] = true;
            else {
                boolean canJump = false;
                for(int j = 1; j <= nums[i]; j++){
                    // nums[i + j] is where we can jump from here
                    if(dp[i + j] == true){
                        canJump = true;
                        break;
                    }
                }
                dp[i] = canJump;
            }
        }
        return dp[0];
    }
}