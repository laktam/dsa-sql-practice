class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int l = 0;
        int r = height.length - 1;
        while(l < r){
            int minHeight = Math.min(height[l], height[r]);
            int water = minHeight * (r - l);
            max = Math.max(max, water);
            if(height[l] > height[r]) r--;
            else l++;
        }
        return max;
    }
}