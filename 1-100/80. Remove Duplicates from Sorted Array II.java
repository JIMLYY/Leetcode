class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length <=2) return nums.length;
        int loc = 2;
        for(int idx = 2; idx < nums.length; idx ++){
            if(!(nums[loc - 1] == nums[loc - 2] && nums[loc - 1] == nums[idx])){
                nums[loc++] = nums[idx];
            }
        }
        return loc;
    }
}
/*
Topic: two pointer
Time complexity: O(N)
Space complexity: O(1)
*/
