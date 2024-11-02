class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> intersection = new ArrayList<Integer>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        if(nums1.length > nums2.length){
            int i2 = 0;
            int i1 = 0;
            while( i2 < nums2.length){
                i1 = 0;
                while(i1 < nums1.length){
                    if(nums1[i1] == nums2[i2]){
                        intersection.add(nums1[i1]);
                        while(i2 + 1 < nums2.length && nums2[i2] == nums2[i2 + 1]) i2++;
                        while(i1 + 1 < nums1.length && nums1[i1] == nums1[i1 + 1]) i1++;
                        // i2++;
                        i1++;
                        break;
                    }
                    i1++;
                    
                }
                i2++;
                
            }
        }else{
            int i2 = 0;
            int i1 = 0;
            while( i1 < nums1.length){
                i2 = 0;
                while(i2 < nums2.length){
                    if(nums1[i1] == nums2[i2]){
                        intersection.add(nums1[i1]);
                        while(i2 + 1 < nums2.length && nums2[i2] == nums2[i2 + 1]) i2++;
                        while(i1 + 1 < nums1.length && nums1[i1] == nums1[i1 + 1]) i1++;
                        i2++;
                        // i1++;
                        break;
                    }
                    i2++;
                    
                }
                i1++;
                
            }
        }
        return intersection.stream().mapToInt(Integer::intValue).toArray();
    }
}