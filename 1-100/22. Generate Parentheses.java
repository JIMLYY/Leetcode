class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new LinkedList<String>();
        helper("", res, n, 0, 0);
        return res;
    }
    public void helper(String curr, List<String> res, int n, int left, int right){
        if(right == n){
            res.add(curr);
            return;
        }
        if(left < n){
            helper(curr +"(", res, n, left + 1, right);
        }
        if(right < left){
            helper(curr +")", res, n, left, right + 1);
        }
    }
}

/*
Topic: String & Backtracking
Method: This is a classic Backtracking problem. We can define a helper function to
solve this problem. Basic, the helper function takes 5 arguements. String curr is
used to keep track of current string. res is the a list of string to store the results.
n is the number of '()' we can use. left and right is the number of '(' or ')' we have
in current string. A good schematic illustration can be found https://www.cnblogs.com/puyangsky/p/6775185.html
TC: O(4^n/n^(1/2))  Each valid sequence has at most n steps during the backtracking procedure.
SC: O(4^n/n^(1/2))
*/
