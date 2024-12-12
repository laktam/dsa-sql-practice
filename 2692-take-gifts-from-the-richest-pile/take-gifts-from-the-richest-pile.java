class Solution {
    public long pickGifts(int[] gifts, int k) {
        int max = 0;
        for(int i = 0; i < k; i++){
            for(int g = 0; g < gifts.length; g++){
                if(gifts[g] > gifts[max]){
                    max = g;
                }
            }
            int maxValue = gifts[max];
            double leave = Math.floor(Math.sqrt(maxValue));
            gifts[max] = (int) leave;
        }

        long result = 0;
        for(int i = 0; i < gifts.length; i++){
            result += gifts[i];
        }
        return result;
    }
}