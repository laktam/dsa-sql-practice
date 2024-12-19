class Solution {
    public int searchInsert(int[] nums, int target) {
        int r = nums.length - 1;
        int l = 0;
        int mid = (l + r) / 2;
        while(l <= r){
            mid = (l + r) / 2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] > target){
                r = mid - 1;
            }
            else l = mid + 1;
        }
        if(nums[mid] > target){
            return mid;
        }
        else return mid + 1;
        

    }
}