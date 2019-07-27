class Solution {
    public int maxSubArrayLen(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap <Integer, Integer>();
        int preSum = 0, max = 0;
        for(int i = 0; i < nums.length; i++){
            preSum += nums[i];
            if(preSum == k){
                max = i + 1;
            }else if(map.containsKey(preSum - k)){
                max = Math.max(max, i - map.get(preSum - k));
            }
            if(!map.containsKey(preSum)){
                map.put(preSum, i);
            }
        }
        return max;
    }
}
/*
Topic: HashTable
Algorithms:
1. HashMap stores the sum before index i (inclusively) as key. and i as value.
2. each if the current sum == target k
3. check currentSum - previousSum to find the subarry that has the sum of k
4. upgrade the max
Time: O(N)
Space: O(N)
*/
