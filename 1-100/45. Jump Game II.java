class Solution {
    public int jump(int[] nums) {
        if(nums == null || nums.length <=1) return 0;
        int currMax = 0;
        int nextMax = 0;
        int index = 0;
        int step = 0;
        while(index <= currMax){
            while(index <= currMax){
                nextMax = Math.max(nextMax, index + nums[index]);
                index++;
            }
            currMax = nextMax;
            step++;
            if(currMax >= nums.length - 1) return step;
        }
        return 0;
    }
}

/*
Topic: array & greedy
Method: We define four variables to solve this problem. step is the answer we want.
currMax is the boundary of current step. When we iterate through each index of every step.
We also update the nextMax, which is the farthest index we can get. Then it will be assigned
to currMax to execute next cycle of iteration.
The funciton of outer while loop is to check the corner case such as we are stuck in "0".
If that happened, index would be larger than currMax. Therefore, we return 0.
Time complexity: O(N)
Space complexity: O(1)
*/
