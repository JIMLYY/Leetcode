class Solution {
    public int rob(int[] nums) {
        int rob = 0;
        int notRob = 0;
        for(int num : nums){
            int pre = Math.max(notRob, rob);
            rob = notRob + num;
            notRob = pre;
        }
        return Math.max(rob, notRob);
    }
}
/*
Topic: dynamic programming
Method: rob is the maximum amount of money that we can get if we
rob the currrent house. notRob is the maximum amount of money that
we can get if we do not rob the current house.
pre = Math.max(notRob, rob) is max value of (notRob, rob) in previous step.

if we decide to rob current house, we must not rob previous house. Therefore.
rob = notRob + nums

if we do not rob current house, we can either rob or not rob previous house.
Therefore, notRob = pre.

Time complexity: O(N)
Space complexity: O(1)
*/
