class Solution {
    public String simplifyPath(String path) {
        if(path.length() <= 1) return path;
        String[] each = path. split("/");
        Stack<String> stack = new Stack<String>();
        for(String curr: each){
            if(curr.equals("..")){
                if(!stack.empty()) stack.pop();
            } else if(!curr.equals(".") && !curr.isEmpty()){
                stack.push(curr);
            }
        }
        String result = "";
        if(stack.empty()) return "/";
        while(!stack.empty()){
            String newPop = stack.pop();
            // result += "/" + newPop is not right. Since the newest sequence should be at last
            result = "/" + newPop + result;
        }
        return result;
    }
}
/*
Topic; string & stack
Method: Basically, we need split the string into a list of strings
and pop out the previous element if current element is ".." and Stack
is not empty. We also need to push the element to the stack if current
element is not empty and is not ".".
Then, we iterate the stack and return the result.
TC: O(n) SC: O(n)
*/
