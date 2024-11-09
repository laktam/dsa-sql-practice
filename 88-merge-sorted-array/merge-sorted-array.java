class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i1 = m - 1, i2 = n - 1, current = n + m - 1;
        while(i2 >= 0){
            if(i1 >= 0 && nums1[i1] > nums2[i2]) nums1[current--] = nums1[i1--];
            else nums1[current--] = nums2[i2--];
        }
        
    }
}