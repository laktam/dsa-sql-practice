class Solution {
    private class Element {
        private int val;
        private int index;
        public Element(int val, int index){
            this.val = val;
            this.index = index;
        }
    }

    public long findScore(int[] nums) {
        Queue<Element> queue = new PriorityQueue<>((e1, e2) ->{
            if(e1.val == e2.val){
                return e1.index - e2.index;
            }
            else return e1.val - e2.val;
        });
        for(int i = 0; i < nums.length; i++){
            queue.add(new Element(nums[i], i));
        }
        long score = 0;
        int markedCount = 0;
        while(markedCount < nums.length){
            Element minElement = queue.poll();
            if(nums[minElement.index] == 0){
                continue;
            }
            System.out.println(minElement.val);
            int minIndex = minElement.index;
            int min = minElement.val;
            
            if(minIndex - 1 >= 0){
                if(nums[minIndex - 1] != 0){
                    nums[minIndex - 1] = 0;
                    markedCount++;
                }
                
            }
            if(minIndex + 1 < nums.length){  
                if(nums[minIndex + 1] != 0){
                    nums[minIndex + 1] = 0;
                    markedCount++;
                }
            }
            nums[minIndex] = 0;
            markedCount++;
            score += min;
        }
        
        return score;
    }
}