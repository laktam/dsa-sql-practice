class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n == 0) return;
        if(m == 0){
            for(int i = 0; i < n; i++){
                nums1[i] = nums2[i];
            }
            return;
        }
        Queue<Integer> pqueue = new PriorityQueue<>();
        for(int i = 0; i < m; i++){
            pqueue.add(nums1[i]);
        }
        for(int i = 0; i < n; i++){
            pqueue.add(nums2[i]);
        }

        for(int i = 0; !pqueue.isEmpty(); i++){
            nums1[i] = pqueue.poll();
        }
    }
}