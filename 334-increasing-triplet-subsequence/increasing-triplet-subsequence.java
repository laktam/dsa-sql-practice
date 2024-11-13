class Solution {
    public boolean increasingTriplet(int[] nums) {
        if(nums.length < 3) return false;
        // will hold the smallest element so far 
        int first = Integer.MAX_VALUE;
        // will hold the one just after it
        int second =  Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] <= first) first = nums[i];
            else if(nums[i] <= second) second = nums[i];
            else return true;// here f < s < nums[i]
        }
        return false;
    }
}