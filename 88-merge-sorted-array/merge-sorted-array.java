class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n == 0) return;
        if(m == 0) {
            System.arraycopy(nums2, 0, nums1, 0, n);
            return;
        }
        int i1 = m - 1;
        int i2 = n - 1;
        int p = n + m - 1;
        while(i2 >= 0){
            if(i1 >= 0 && nums1[i1] > nums2[i2]) nums1[p--] = nums1[i1--];
            else nums1[p--] = nums2[i2--];
        }
    }
}