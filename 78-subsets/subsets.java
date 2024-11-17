class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        Set<List<Integer>> subsets = new HashSet<>();
        subsets.add(Collections.EMPTY_LIST);
        List<Integer> subset = new ArrayList<>();
        subsets(subsets, subset, nums, 0);
        
        return new ArrayList<List<Integer>>(subsets);
    }

    private void subsets(Set<List<Integer>> subsets, List<Integer> subset, int[] nums, int n){
        if(n >= nums.length) return;
        List<Integer> s = new ArrayList<>(subset);
        s.add(nums[n]);
        subsets.add(s);
        subsets(subsets, s, nums, n + 1);

        List<Integer> ss = new ArrayList<>(subset);
        subsets(subsets, ss, nums, n + 1);

        
    }
}