class Solution {
    public int lastStoneWeight(int[] stones) {
        //Bubble Sort Algorithm:
        // - Compare each pair of adjacent elements.
        // - Swap them if they are in the wrong order.
        // - Continue this process for each pair of elements.
        // - Repeat the above steps until no swaps are needed, 
        // meaning the array is sorted.
        stones = sort(stones);
        int i = 0;
        int n = 0;
        while(stones[i] != 0 && n < stones.length - 1){
                if(stones[i + 1] != stones[i]){
                    stones[i] = stones[i] - stones[i + 1];  
                    stones[i + 1] = 0;
                    stones = sort(stones);
                }else{
                    stones[i] = 0;
                    stones[i + 1] = 0;
                    stones = sort(stones);
                }
                n++;
        }
        
        return stones[0];
    }

    private int[] sort(int subArray[]){
        boolean swap = true;
        while(swap){
            swap = false;
            for(int i = 0; i < subArray.length - 1; i++){
                if(subArray[i] < subArray[i + 1]){
                    int tmp = subArray[i];
                    subArray[i]  = subArray[i + 1];
                    subArray[i + 1] = tmp;
                    swap = true;
                }
            }
        }
        return subArray;
    }

}