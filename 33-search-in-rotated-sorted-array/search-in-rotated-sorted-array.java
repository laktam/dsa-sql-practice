class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        int m = (l + r) / 2;
        
        while(l <= r){
            m = (l + r) / 2;
            if(l == r){
                m = l;
                break;                
            }
            if(nums[m] < nums[r]) {
                r = m;
            }
            else if(nums[m] > nums[r]){
                l = m + 1;
            }
        }
        if(nums[m] <= target && target <= nums[nums.length - 1]){
            l = m;
            r = nums.length - 1;
        }else{
            l = 0;
            r = m - 1;
        }
        while(l <= r){
            m = (l + r) / 2;
            if(nums[m] == target){
                return m;
            }else if (nums[m] > target){
                r = m - 1;
            }else{
                l = m + 1;
            }
        }
        return -1;
    }
}