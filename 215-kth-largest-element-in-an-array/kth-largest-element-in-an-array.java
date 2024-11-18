class Solution {
    public int findKthLargest(int[] nums, int k) {
        return quickSelectLargest(nums, k);
    }

    private int quickSelectLargest(int nums[], int k){
        int l = 0;
        int h = nums.length - 1;
        int target = nums.length - k; // n - k smallest is k largest
        while(l <= h){
            int pivot_index = partition(nums, l, h);
            if(pivot_index == target) return nums[pivot_index];
            if(pivot_index < target) l = pivot_index + 1;
            else h = pivot_index - 1;
        }
        return -1;
    }

    private int partition(int nums[], int l , int h){
        // Randomly select a pivot index
        int randomIndex = l + (int)(Math.random() * (h - l + 1));
        // Swap pivot with the last element
        int t = nums[randomIndex];
        nums[randomIndex] = nums[h];
        nums[h] = t;

        int pivot = nums[h];
        int i = l; // 0 - i : small side
        for(int j = l; j < h; j++){
            // this loop move smaller element to the left
            if(nums[j] < pivot){
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
                i++;
            }
            
        }
        // swap pivot with nums[i]
        int tmp = nums[i];
        nums[i] = nums[h];
        nums[h] = tmp;
        return i;
    }
}