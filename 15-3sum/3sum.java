class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> triplets = new ArrayList<>();
        for(int i = 0; i < nums.length - 2; i++){
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            
            int r = nums.length - 1;
            int l = i + 1;
            while(l < r){
                int sum = nums[i] + nums[r] + nums[l];
                if(sum == 0){
                    triplets.add(Arrays.asList(nums[i], nums[r], nums[l]));
                    while(l < r && nums[l] == nums[l + 1]) l++;
                    while(l < r && nums[r] == nums[r - 1]) r--;
                    r--;
                    l++;
                }else if (sum > 0){
                    r--;
                }else {
                    l++;
                }
            }
        }
        return triplets;
    }
}