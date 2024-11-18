class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) + 1);
            }else{
                map.put(nums[i], 1);
            }
        }

        PriorityQueue<Integer> queue = new PriorityQueue<>(
            new Comparator<Integer>(){
                public int compare(Integer i1, Integer i2){
                    return map.get(i1) - map.get(i2);
                }
            }
        );

        for(Integer key : map.keySet()){
            queue.add(key);
            if(queue.size() > k){
                queue.poll();
            }
        }
        int i = 0;
        int max[] = new int[k];
        while(!queue.isEmpty()){
            max[i] = queue.poll();
            i++;
        }
        return max;
    }
}