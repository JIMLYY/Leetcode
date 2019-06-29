class Solution {
    public int numDecodings(String s) {
        if(s == null || s.length() == 0){
            return 0;
        }
        // DP problem can follow 4 basic steps:
        // 1. define states
        int n = s.length();
        int [] dp = new int[n + 1];
        // 2. initialization
        dp[0] = 1;
        dp[1] = s.charAt(0) != '0'? 1 : 0;
        // 3. transformation function dp[i] is the number of decodes ways at i^th position
        for(int i = 2; i <= n; i++){
            int first = Integer.valueOf(s.substring(i-1, i));
            int second = Integer.valueOf(s.substring(i-2,i));
            if(first >=1 && first <= 9){
                dp[i] += dp[i-1];
            }
            if(second >= 10 && second <= 26){
                dp[i] += dp[i-2];
            }
        }
        // 4. return
        return dp[n];
    }
}
/*
Topic: Dynamic Programming
*/
