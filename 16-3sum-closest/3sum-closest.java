class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        
        int closest = nums[0] + nums[1] + nums[2];
        for(int i = 0; i < nums.length - 2; i++){
            if(i > 0 && nums[i] == nums[i - 1]){
                // if this number is same as last number skip
                continue;
            }

            int l = i + 1;
            int r = nums.length - 1;
            while(l < r){
                int sum = nums[i] + nums[l] + nums[r];
                if(sum == target){
                    return sum;
                }

                if(isCloserThan(sum, closest, target)){
                    closest = sum;
                    if(sum > target){
                        while(l < r && nums[r-1] == nums[r]) r--;
                        r--;
                    }else{
                        while(l < r && nums[l + 1] == nums[l]) l++;
                        l++;
                    }   
                }else {
                    if(sum > closest){
                        while(l < r && nums[r-1] == nums[r]) r--;
                        r--;
                    }else{
                        while(l < r && nums[l + 1] == nums[l]) l++;
                        l++;
                    }   
                }
            }
        }
        return closest;
    }

    // check if i1 is closest
    private boolean isCloserThan(int i1, int i2, int target){
        if(Math.abs(i1 - target) < Math.abs(i2 - target)){
            return true;
        }else {
            return false;
        }
    }
}