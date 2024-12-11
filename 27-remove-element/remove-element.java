class Solution {
    public int removeElement(int[] nums, int val) {
        int put = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                int tmp = nums[put];
                nums[put] = nums[i];
                nums[i] = tmp;
                put++;
            }
        }

        return put;
    }
}