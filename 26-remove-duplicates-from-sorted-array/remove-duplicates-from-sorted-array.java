class Solution {
    public int removeDuplicates(int[] nums) {
        int unique = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[unique]){
                unique++;
                int tmp = nums[unique];
                nums[unique] = nums[i];
                nums[i] = tmp;
            }
        }
        return unique + 1;
    }

}