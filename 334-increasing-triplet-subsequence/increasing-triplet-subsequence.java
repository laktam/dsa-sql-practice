class Solution {
    public boolean increasingTriplet(int[] nums) {
        int small = Integer.MAX_VALUE;
        int smaller = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < smaller){
                smaller = nums[i];
            }else if(smaller < nums[i] && nums[i] < small){
                small = nums[i];
            }else if(small < nums[i]){
                return true;
            }
        }
        return false;
        
    }
}