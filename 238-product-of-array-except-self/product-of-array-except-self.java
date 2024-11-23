class Solution {
    public int[] productExceptSelf(int[] nums) {
        // elem i in result is : prefix[i - 1] * suffix[i + 1];
        int l = nums.length;

        int prefix[] = new int[l];
        prefix[0] = nums[0];
        for(int i = 1; i < l; i++){
            prefix[i] = prefix[i - 1] * nums[i];
        }
        int suffix[] = new int[l];
        suffix[l - 1] = nums[l - 1];
        for(int i = l - 2; i >= 0; i--){
            suffix[i] = nums[i] * suffix[i + 1] ;
        }
        for(int i = 0; i < l; i++){
            int p = 1;
            int s = 1;
            if(!(i - 1 < 0)) p = prefix[i - 1];
            if(!(i + 1 >= l)) s = suffix[i + 1];
            nums[i] = p * s;
        }
        return nums;
    }
}