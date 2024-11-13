class Solution {
    public boolean increasingTriplet(int[] nums) {
        if(nums.length < 3) return false;
        int first = Integer.MAX_VALUE;
        int second =  Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < first) first = nums[i];
            else if(first < nums[i] && nums[i] < second) second = nums[i];
            else if(first < second && second < nums[i]) return true;
        }
        return false;
    }
}