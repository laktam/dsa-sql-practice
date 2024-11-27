class Solution {
    public int climbStairs(int n) {
        if(n == 1) return 1;
        if(n == 2) return 2;
        int beforePrev = 1;
        int prev = 2;
        int result = 0;
        // bPrev prev result  next
        for(int i = 3; i <= n; i++){
            result = beforePrev + prev;
            beforePrev = prev;
            prev = result;
        } 
        return result;
    }
}