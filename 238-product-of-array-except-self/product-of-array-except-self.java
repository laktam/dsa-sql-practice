class Solution {
    public int[] productExceptSelf(int[] nums) {
        int l = nums.length;

        // prefix
        int out[] = new int[l];
        out[0] = 1;
        for(int i = 1; i < l; i++){
            out[i] = out[i - 1] * nums[i - 1];
        }

        int suffix = 1;
        for(int i = l - 1; i >= 0; i--){
            out[i] = out[i] * suffix;
            suffix = suffix * nums[i];
        }
        
        return out;
    }
}