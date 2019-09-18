class Solution {
    public String longestPalindrome(String s) {
        String res ="";

        if(s == null || s.length() == 0){
            return res;
        }

        int maxLen = 0;
        for(int i = 0; i < s.length(); i++){

            int len1 = getLongest(s, i, i).length();
            if(len1 > maxLen){
                maxLen = len1;
                res = getLongest(s, i, i);
            }

            int len2 = getLongest(s, i, i + 1).length();
            if(len2 > maxLen){
                maxLen = len2;
                res = getLongest(s, i, i + 1);
            }
        }
        return res;

    }

    public String getLongest(String s, int l, int r){
        while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)){
            l -= 1;
            r += 1;
        }
        return s.substring(l+1, r);
    }
}

/*
Topic: string
Time: O(N**2)
Space: O(1)
*/
