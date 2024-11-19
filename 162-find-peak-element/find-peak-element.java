class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length == 1) return 0;
        int l = 0;
        int r = nums.length - 1;
        while(l <= r){
            if(l == r) return l;

            int m = (l + r) / 2;
            int leftValue = m - 1 >= 0 ? nums[m - 1] : Integer.MIN_VALUE;
            int rightValue = m + 1 < nums.length ? nums[m + 1] : Integer.MAX_VALUE;

            if(leftValue < nums[m] && nums[m] > rightValue){
                return m;
            }else if( nums[m] < rightValue){
                l = m + 1;
            }else{
                r = m - 1;
            }
        }
        return -1;
    }
}