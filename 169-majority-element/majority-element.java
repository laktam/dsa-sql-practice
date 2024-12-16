class Solution {
    public int majorityElement(int[] nums) {
        int maxFreq = Integer.MIN_VALUE;
        int maj = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            int newFreq = map.get(nums[i]);
            if(newFreq > maxFreq){
                maj = nums[i];
                maxFreq = newFreq;
            }
        }
        return maj;
    }
}