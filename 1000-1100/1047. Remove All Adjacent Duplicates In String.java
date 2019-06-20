class Solution {
    public String removeDuplicates(String S) {
        // corner cases test
        if(S == null || S.length() < 2) return S;

        // new stack
        Stack <Character> stack = new Stack<Character>();

        //push every character into stack while removing the adjacent duplicates
        for(int i = 0; i < S.length(); i++){
            if(stack.isEmpty() || S.charAt(i)!= stack.peek()){
                stack.push(S.charAt(i));
            }else{
                stack.pop();
            }
        }

        // pop characters from stack and form the resutls. Becareful with the order

        StringBuilder res = new StringBuilder();
        while(! stack.isEmpty()){
            res.append(stack.pop());
        }
        return res.reverse().toString();
    }
}

/*
Topic: stack
Method: The idea is simple.
1. push the char into stack if it does not have adjacent duplicates
2. use stringbuilder to return the result
Time complexity: O(N)
Space complexity: O(N)
N is the length of string
*/
