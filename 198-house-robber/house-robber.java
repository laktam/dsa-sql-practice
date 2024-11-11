class Solution {
    public int rob(int[] nums) {
        // rob1 : the max up till the i - 2 house [rob1, rob2, i, ....]
        int rob1 = 0;
        // rob2 : the max up till the i - 1 house [rob1, rob2, i, ....]
        int rob2 = 0;
        for(int i = 0; i < nums.length; i++){
            // either we rob current house + rob 1 (max robbed till i - 2)
            // or we take the max robed up to the last house (rob2 )

            // max is the max we can rob from 0 till i
            // it is either the max robbed from 0 till (i - 2) + nums[i] 
            // or the max robbed from 0 till (i - 1)
            int max = Math.max(rob1 + nums[i], rob2);
            rob1 = rob2;
            rob2 = max;
        }
        return rob2;
    }
}