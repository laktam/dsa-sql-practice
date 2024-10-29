class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> triplets = new ArrayList<>();
        for(int i = 0; i < nums.length - 2; i++){
            if(i > 0 && nums[i] == nums[i - 1]){
                continue; // avoid duplicate
            }
            int r = nums.length - 1;
            int l = i + 1;
            while(l < r){
                int sum = nums[i] + nums[l] + nums[r];
                if(sum == 0){
                    triplets.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    while(l < r && nums[r] == nums[r - 1]){
                        r--;
                    }
                    while(l < r && nums[l] == nums[l + 1]){
                        l++;
                    }
                    r--;
                    l++;
                }else if(sum > 0) {
                    r--;
                }else {
                    l++;
                }

            }

        }

        return triplets;
    }

}