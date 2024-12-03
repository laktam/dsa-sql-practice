class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int n = height.length;
        
        int l = 0;
        int r = n - 1;
        while(l < r){
            int small = Math.min(height[l], height[r]);
            max = Math.max((small * (r - l)), max);

            if(height[r] > height[l]){
                l++;
            }else{
                r--;
            }
        }
        return max;
    }
}