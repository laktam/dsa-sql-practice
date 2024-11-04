class KthLargest {
    private List<Integer> scores;
    private int k;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        scores = new ArrayList<>();
        Arrays.sort(nums);
        for(int i : nums){
            scores.add(i);
        }
    }
    
    public int add(int val) {
        if(scores.size() == 0){
            scores.add(val);
            return val;    
        } 

        for(int s = scores.size() - 1; s >= 0; s--){
            if(s == scores.size() - 1 && val > scores.get(s)){
                scores.add(val);
                break;
            }else if (val > scores.get(s)){
                scores.add(s + 1, val);
                break;
            }else if(s == 0){
                if(scores.get(0) > val){
                    scores.add(0, val);
                }else{
                    scores.add(1, val);
                }
                break;
            }
        }
        if(scores.size() == 1) return scores.get(0);
        return scores.get(scores.size() - k);
        
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */