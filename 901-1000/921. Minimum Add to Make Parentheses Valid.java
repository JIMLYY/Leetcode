// Method 1 stack
class Solution {
    public int minAddToMakeValid(String S) {
        Stack<Character> stack = new Stack<>();
        int count = 0;
        for(Character c : S.toCharArray()){
            if(c == '('){
                stack.push(c);
            }
            else if(! stack.isEmpty()){
                stack.pop();
            }else{
                count ++;
            }
        }

        while(! stack.isEmpty()){
            count ++;
            stack.pop();
        }
        return count;
    }
}
/*
Topic: array & stack
Method 1: use stack. If we come across '(', We push it to the stack.
If we come across ')', we pop out the previous open parentheses since they can
form a pair. But if the stack is empty, count ++ since there is no '(' can pair
with current ')'. After the loop, we check if there are unpaired leftover '('.
The result should be the sum of those two parts.
Time: O(N)
Space: O(N)
*/
// Method 2 one pass
class Solution {
    public int minAddToMakeValid(String S) {
        if(S == null || S.length() == 0) return 0;
        int left = 0, right = 0;
        for(int i = 0; i < S.length(); i++){
            if(S.charAt(i) == '('){
                right ++;
            } else if(right > 0){
                right --;
            }else{
                left ++;
            }
        }
        return left + right;
    }
}

/*
Topic: array & stack
Method: the idea is similar. But we do not use stack here.
We check every character of String. If it is a '(', we need a ')' to pair.
So right ++. If it is a ')', we decrease right by one if it is still > 0.
Else, we have to increament left by one since we need more '('. Finally,
return left + right
Time: O(N)
Space: O(1)
*/
