class Solution {
    public String[] findRelativeRanks(int[] score) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < score.length; i++){
            map.put(score[i], i);
        }
        //selection sort (desc)
        for(int i = 0; i < score.length; i++){
            int max = i;
            for(int j = i + 1; j < score.length; j++){
                if(score[j] > score[max]){
                    max = j;
                }
            }
            int tmp = score[i];
            score[i] = score[max];
            score[max] = tmp;
        }
        System.out.println(Arrays.toString(score));
        //
        String out[] = new String[score.length];
        for(int i = 0; i < score.length; i++){
            if(i == 0) out[map.get(score[i])] = "Gold Medal";
            else if(i == 1) out[map.get(score[i])] = "Silver Medal";
            else if(i == 2) out[map.get(score[i])] = "Bronze Medal";
            else out[map.get(score[i])] = (i + 1) + "";
        }
        return out;
    }
}