class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0, leftSum = 0;
        // get the sum of the array
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        // check if the pivot index exists
        for(int j = 0;  j < nums.length; j++){
            if(2 * leftSum == sum - nums[j]) return j;
            leftSum += nums[j];
        }
        return - 1;
    }
}
/*
Topic: array
Time complexity: O(N) where N is the length of nums
Space complexity: O(1)
*/
