class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        boolean result[] = new boolean[queries.length];
        
        List<int[]> specials = new ArrayList<>();
        int start = 0;
        int i = 0;
        while(i < nums.length){
            // look for special end
            int end = start;
            while(i + 1 < nums.length && (nums[i] + nums[i + 1]) % 2 == 1){
                end = i + 1;
                i++;
            }
            specials.add(new int[]{start, end});
            i++;
            start = i;
        }
        
        // specials.forEach((arr) -> {
        //     System.out.println(Arrays.toString(arr));
        // });


        for(int q = 0; q < queries.length; q++){

            int s = queries[q][0];
            int e = queries[q][1];
            if(s == e) {
                result[q] = true;
                continue;
            }

            int l = 0;
            int r = specials.size() - 1;
            while(l <= r){
                int mid = (l + r) / 2;
                int special[] = specials.get(mid);
                if(s >= special[0] && e <= special[1]){
                    result[q] = true;
                    break;
                }
                else if(s < special[0]){
                    r = mid - 1;
                } else{
                    l = mid + 1;
                }
            }
            // default boolean value is false !
            // so if it is not set to true in the binary search it stay false

        }


        // for(int q = 0; q < queries.length; q++){
        //     int s = queries[q][0];
        //     int e = queries[q][1];
        //     if(s == e) {
        //         result[q] = true;
        //         continue;
        //     }
        //     for(int[] special : specials){
        //         if(s >= special[0] && e <= special[1]){
        //             result[q] = true;
        //             break;
        //         }
        //     }
        // }

        return result;
    }
}