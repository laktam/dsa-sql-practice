class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while(l <= r){
            int m = (l + r) / 2;
            if(nums[m] == target){
                return range(nums, m);
            }else if(nums[m] < target){
                l = m + 1;
            }else {
                r = m - 1;
            }
        }
        int notFound[] = new int[2];
        notFound[0] = -1;
        notFound[1] = -1;
        return notFound;
    }

    private int[] range(int nums[], int index){
        int l = index;
        int r = index;
        for(int i = index; i >= 0; i--){
            if(nums[index] == nums[i]) l = i;
            else break;
        }

        for(int i = index; i < nums.length; i++){
            if(nums[index] == nums[i]) r = i;
            else break;
        }

        int range[] = new int[2];
        range[0] = l;
        range[1] = r;
        return range;
    }
}