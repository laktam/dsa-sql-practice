class Solution {
    public int[][] merge(int[][] intervals) {
        Queue<Integer[]> queue = new PriorityQueue<>((arr1, arr2) -> arr1[0] - arr2[0]);
        for(int i = 0; i < intervals.length; i++){
            queue.add(new Integer[] {intervals[i][0], intervals[i][1]});
        }
        Integer[][] arr = new Integer[queue.size()][];
        int index = 0;
        while (!queue.isEmpty()) {
            arr[index++] = queue.poll();
        }

        int resultLength = arr.length;
        for(int i = 0; i < arr.length; i++){
            if(i > 0){
                if(arr[i - 1][1] >= arr[i][0]){// if they overlap
                    // merge them : the two arrays contain now a copy of the merge
                    // put the smallest element in arr[i][0] and the biggest in arr[i][1]
                    arr[i][0] = arr[i][0] < arr[i - 1][0] ? arr[i][0] : arr[i - 1][0];
                    arr[i][1] = arr[i][1] < arr[i - 1][1] ? arr[i - 1][1] : arr[i][1];

                    arr[i - 1] = null;
                    resultLength--;
                    // i--;
                    // 0 1, 1 4, 4 5
                    // 0
                }
            }
        }
        int[][] result = new int[resultLength][2];
        int r = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != null) {
                result[r] = new int[] {arr[i][0], arr[i][1]};
                r++;
            }
        }
        return result;
        

    }
}