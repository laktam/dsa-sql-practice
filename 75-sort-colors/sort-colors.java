class Solution {
    public void sortColors(int[] nums) {
        // count occurences of each key
        int count[] = new int[3];
        for(int i = 0; i < nums.length; i++){
            count[nums[i]]++;
        }
        // prefix sum
        for(int i = 1; i < 3; i++){
            count[i] = count[i] + count[i - 1];
        }
        System.out.println(Arrays.toString(count));
        // sort
        int out[] = new int[nums.length];
        for(int i = nums.length - 1; i >= 0; i--){
            int k = nums[i];
            int index = count[k] - 1;
            out[index] = k;
            //swap
            // if(i != index){
            //     int tmp = nums[index];
            //     nums[index] = nums[i];
            //     nums[i] = tmp;
            // }
            count[k]--;
        }
        System.arraycopy(out, 0, nums, 0, nums.length);
    }
}