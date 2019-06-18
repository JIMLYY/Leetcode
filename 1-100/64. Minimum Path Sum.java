class Solution {
    public int minPathSum(int[][] grid) {
        int m  = grid.length;
        int n  = grid[0].length;
        // 1. state dp[i][j]: min sum from (0,0) to (i,j)
        int[][] dp = new int[m][n];
        // 2. initialize
        dp[0][0] = grid[0][0];
        for(int i = 1; i < m; i++){
            dp[i][0] = dp[i-1][0] + grid[i][0];
        }
        for(int j = 1; j < n; j++){
            dp[0][j] = dp[0][j-1] + grid[0][j];
        }
        // 3. function: dp[i][j] = min(dp[i][j-1], dp[i-1][j]) + grid[i][j]
        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                dp[i][j] = Math.min(dp[i][j-1], dp[i-1][j]) + grid[i][j];
            }
        }
        // 4. return
        return dp[m-1][n-1];
    }
}
/*
Topic: array, Dynamic programming (DP)
DP has 4 fundamental steps. 1. determine state 2. initialize 3. DP fucntion
4. return resutls.
The key of this problem is DP fucntion, whici is dp[i][j] = min(dp[i][j-1], dp[i-1][j]) + grid[i][j].
It means the min sum from (0,0) to (i,j).
TC: O(n^2) or O(m * n)  We traverse the entire matrix once.
SC: O(m * n). Another matrix of the same size is used.

*/
