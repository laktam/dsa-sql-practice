class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // map for key : index;
        // frequency map , key : frequency
        // sort the array
        // 
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        return map.entrySet().stream()
            .sorted((e1, e2) -> e2.getValue() - e1.getValue())
            .limit(k)
            .mapToInt(e -> e.getKey())
            .toArray();

    }
}