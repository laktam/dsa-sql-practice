class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int start = 0;
        int end = 0;
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for(int i = 0; i < nums1.length; i++){
            list.add(nums1[i]);
        }
        for(int i = 0; i < nums2.length; i++){
            if(list.contains(nums2[i])){
                list.remove(new Integer(nums2[i]));
                list2.add(nums2[i]);
            }
        }
        int out[] = new int[list2.size()];
        Iterator it = list2.iterator();
        int i = 0;
        while(it.hasNext()){
            out[i] = (Integer) it.next();
            i++;
        }
        return out;
    }
}