/*
Topic: stack
Method 1: brute-force check every possibility
Time: O(N^3)
Space:O(1)
TLE

Method 2: better brute-froce
when traversing over the array, we simultaneously keep
track of the minium element found so for. Then, we only
need to find a nums[k] that satisfies the 132 criteria.
Time: O(N^2)
Space:O(1)

Method 3: Monotonous Stack
traver over the array backwards while maintaing a stack storing the num bigger
that the "third number". We also need to update the "third number " simultaneously.
Therefore, if we can find a number smaller than the "third number ", we would return
true.
Time: O(N)
Space:O(n)
*/

// Method 1
class Solution {
    public boolean find132pattern(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[k] > nums[i] && nums[j] > nums[k])
                        return true;
                }
            }
        }
        return false;
    }
}


// Method 2
class Solution {
    public boolean find132pattern(int[] nums) {
        int min_i = Integer.MAX_VALUE;
        for(int j = 0; j < nums.length - 1; j++){
            min_i = Math.min(min_i,nums[j]);
            for(int k = j + 1; k < nums.length; k++){
                if(nums[k] < nums[j] && nums[k] > min_i){
                    return true;
                }
            }
        }
        return false;
    }
}

// Method 3
class Solution {
    public boolean find132pattern(int[] nums) {
        Stack <Integer> stack = new Stack<>();
        int third = Integer. MIN_VALUE;
        for(int i = nums.length - 1; i >= 0; i--){
            if(nums[i] < third){
                return true;
            }
            while(!stack.isEmpty() && nums[i] > stack.peek()){
                third = stack.pop();
            }
            stack.push(nums[i]);
        }
        return false;
    }
}
