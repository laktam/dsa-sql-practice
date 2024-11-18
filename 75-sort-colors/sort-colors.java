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
        // sort
        for(int i = count.length - 1; i >= 0; i--){
            // i here is the key to be sorted (the color)
            int index = count[i] - 1;
            int stop = 0;
            if(i - 1 >= 0){
                stop = count[i - 1];
            } 

            while(index >= stop){
                nums[index] = i;
                index--;
            }
        }

    }
}