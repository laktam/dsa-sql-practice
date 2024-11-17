class Solution {
    public List<List<Integer>> permute(int[] nums) {
        if(nums.length < 2) return new ArrayList(Arrays.asList(nums));
        List<List<Integer>> permutations = new ArrayList<>();
        permute(permutations, Arrays.stream(nums).boxed().collect(Collectors.toList()), 0);
        return permutations;
    }

    private void permute(List<List<Integer>> permutations, List<Integer> permutation, int n){
        if(!permutations.contains(permutation)) permutations.add(permutation);
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