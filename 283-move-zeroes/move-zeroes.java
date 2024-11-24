class Solution {
    public void moveZeroes(int[] nums) {
        boolean swap = true;
        int n = nums.length - 1;
        while(swap){
            swap = false;
            for(int i = 0; i < n; i++){
                if(nums[i] == 0){
                    swap = true;
                    nums[i] = nums[i + 1];
                    nums[i + 1] = 0;
                }
            }
            n--;
        }
        return;
        
    }
}