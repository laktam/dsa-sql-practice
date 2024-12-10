class Solution {
    private Set<List<Integer>> result = new HashSet<>();
    
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<Integer> subsequence = new ArrayList<>();
        backtrack(nums, 0, subsequence);
        return new ArrayList<List<Integer>>(result);
    }

    private void backtrack(int[] nums, int index, List<Integer> subsequence){
        if(subsequence.size() >= 2){
            result.add(new ArrayList<>(subsequence));
        }
        for(int i = index; i < nums.length; i++){
            if(subsequence.isEmpty() || subsequence.get(subsequence.size() - 1) <= nums[i]){
                subsequence.add(nums[i]);
                backtrack(nums, i + 1, subsequence);
                subsequence.remove(subsequence.size() - 1);
            }

        }
    } 
}