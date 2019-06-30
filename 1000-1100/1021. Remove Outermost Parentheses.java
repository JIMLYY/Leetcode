class Solution {
    public String removeOuterParentheses(String S) {
        StringBuilder sb = new StringBuilder();
        int opened = 0;
        for(char c : S.toCharArray()){
            if(c == '(' && opened ++ > 0) sb.append('(');
            if(c == ')' && opened -- > 1) sb.append(')');
        }
        return sb.toString();
    }
}
/*
Topic: Array, Stack
Method: append every pair of '()' except the outermost one of each primitive string. To achieve that,
we can used an int variable opened to skip the outermost pair parentheses.
Space complexity:O(N)
Time complexity: O(N)
*/
