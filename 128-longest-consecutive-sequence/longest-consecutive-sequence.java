class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i] - 1)){
                map.put(nums[i], map.get(nums[i] - 1) + 1);
            }else{
                map.put(nums[i], 1);
            }

            if(map.get(nums[i]) > max) max = map.get(nums[i]);
        }
        return max;
    }
}