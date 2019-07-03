class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int localSum = 0;
        int minLen = Integer. MAX_VALUE;
        int start = 0;
        for(int end = 0; end < nums.length; end++){
            localSum += nums[end];
            while(localSum >= s && start <= end){
                minLen = Math.min(minLen, end - start +1);
                localSum -= nums[start];
                start++;
            }
        }
        return minLen == Integer.MAX_VALUE? 0: minLen;
    }
}
/*
Topic: array, two pointers, binary search
Method: use two pointers to find the subarrays with the localSum >= s. Basically, we use end pointer to iterate every number in the array. When the localSum between start and end pointer >= s, we would try to move the left pointer in order to find a a smaller length.
Time complexity: O(N)
Space complexity:O(1)
*/
