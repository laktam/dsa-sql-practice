class Solution {
    public int uniquePaths(int m, int n) {
        // each cell contains the number of paths to reach that cell
        int dp[][] = new int[m][n];
        
        for (int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++){
                if(j == 0 && i == 0) dp[i][j] = 1;
                else {
                    int p1 = 0;
                    int p2 = 0;
                    if(i - 1 >= 0) p1 = dp[i - 1][j];
                    if(j - 1 >= 0) p2 = dp[i][j - 1];
                    dp[i][j] = p1 + p2;
                }
            }
        }
        return dp[m - 1][n - 1];
    }
}