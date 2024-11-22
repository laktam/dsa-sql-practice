class Solution {
    public int lengthOfLIS(int[] nums) {
        int dp[] = new int[nums.length];
        int max = 1;
        for(int i = 0; i < nums.length; i++){
            if(i == 0) dp[i] = 1;
            else{
                List<Integer> s = new ArrayList<>();
                for(int j = 0; j < i; j++){
                    if(nums[j] < nums[i]) s.add(dp[j] + 1);
                    else s.add(1);
                }
                dp[i] = Collections.max(s);
                if(dp[i] > max) max = dp[i];
            }
        }
        return max;
    }
}