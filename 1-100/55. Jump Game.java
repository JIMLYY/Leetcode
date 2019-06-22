class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length < 2) return true;
        int range = 0;
        for(int i = 0; i < nums.length && i <= range; i++){
            range = Math.max(range, nums[i] + i);
            if(range >= nums.length - 1) return true;
        }
        return false;
    }
}
/*
Topic: Array, greedy
Method: The idea is to the use range to keep track of the farthest position we can go to. Eventually, if range >= nums.length - 1, it would suggest that we can reach the end.
Meanwhile, the conditon of going on is not only i < nums.length  but also i <= range.
at the end of loop, if
Time complexity: O(N)
Space complexity: O(N)
*/
