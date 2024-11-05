class Solution {
    public int removeDuplicates(int[] nums) {
        // to track unique element
        int unique = 0;
        for(int i = 1; i < nums.length; i++){
            // found a new unique element
            if(nums[i] != nums[unique]){
                unique++;//increment to put it next to the unique element before it
                nums[unique] = nums[i];
            }
        }
        return ++unique; 
    }

}