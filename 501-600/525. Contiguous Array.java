class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> sumToIndex = new HashMap<Integer, Integer>();
        int max = 0, sum = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                nums[i] = -1;
            }
        }
        sumToIndex.put(0, -1);
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            if(sumToIndex.containsKey(sum)){
                max = Math.max(max, i - sumToIndex.get(sum));
            }else{
                sumToIndex.put(sum, i);
            }
        }
        return max;
    }
}
/*
Topic: HashTable
Algorithms:
1. change o in the array to 1
2. if we find sum[i,j] == 0 then we know there are even number of
-1 and 1 between index i and j.
3. use HashTable, which allows a O(1) search.
Time: O(N)
Space: O(N)
*/
