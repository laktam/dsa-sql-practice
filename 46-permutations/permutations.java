class Solution {
    public List<List<Integer>> permute(int[] nums) {
        if(nums.length < 2) return new ArrayList(Arrays.asList(nums));
        Set<List<Integer>> permutations = new HashSet<>();
        permute(permutations, Arrays.stream(nums).boxed().collect(Collectors.toList()), 0);
        return new ArrayList<List<Integer>>(permutations);
    }

    private void permute(Set<List<Integer>> permutations, List<Integer> permutation, int n){
        permutations.add(permutation);
        if(n == permutation.size()) return;
        for(int i = 0; i < permutation.size(); i++){
            List<Integer> newPermutation = new ArrayList<>(permutation);
            if(i == n) continue;
            int tmp = newPermutation.get(i);
            newPermutation.set(i, newPermutation.get(n));
            newPermutation.set(n, tmp);
            permute(permutations, newPermutation, n + 1);
        }
    }
}