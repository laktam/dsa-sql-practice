class Solution {

    // in place
    public void rotate(int[] nums, int k) {
        k = k % nums.length; // this return k if it is lees than length
        reverse(0, nums.length - 1, nums);
        reverse(0, k - 1, nums);
        reverse(k, nums.length - 1, nums);
    }

    private void reverse(int i, int j, int nums[]){
        while(i < j){
            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
            i++;
            j--;
        }
    }



    // with extra memory
    // public void rotate(int[] nums, int k) {
    //     int help[] = new int[nums.length];
    //     for(int i = 0; i < nums.length; i++){
    //         help[(i + k) % nums.length] = nums[i];
    //     }
    //     System.arraycopy(help, 0, nums, 0, nums.length);
    // }
}