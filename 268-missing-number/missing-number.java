class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int realSum = 0;
        for(int i = 0; i <= nums.length; i++){
            sum += i;
        }
        for(int i = 0; i < nums.length; i++){
            realSum += nums[i];
        }
        return sum - realSum;
    }
}