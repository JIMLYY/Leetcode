class Solution {
    public int findLength(int[] A, int[] B) {
        int res = 0;
        int[][] memo = new int[A.length + 1][B.length + 1];
        for(int i = A.length - 1; i >= 0 ; i--){
            for(int j = B.length - 1; j >= 0; j--){
                if(A[i] == B[j]){
                    memo[i][j] = memo[i + 1][j + 1] + 1;
                }
                res = Math.max(res, memo[i][j]);
            }
        }
        return res;
    }
}
/*
Topic: Dynamic Programming
Algorithms: 
1. construct a 2D array memo with size [i + 1][j + 1]
2. memo[i][j] is the longest prefix of A[i:] and B[j:]
3. iterate through the 2D array
4. whenever A[i] == B[j] --> dp[i][j] = dp[i + 1][j + 1] + 1
Time: O(M * N)
Space: O(M * N)
*/
