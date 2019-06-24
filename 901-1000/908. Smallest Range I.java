class Solution {
    public int smallestRangeI(int[] A, int K) {
        int max = A[0];
        int min = A[0];
        for(int num: A){
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return Math.max(0, max - min - 2 * K);
    }
}
/*
Topic: Math
Method: This question seems to be difficult. But what it really asks is to find
the difference between max and min in B. Why? Because if the max and min value
can overlap after modification(max - min - 2 * K <= 0). Other values can modified
and reach that overlapped value as well. Therefore, after getting the max and min
value of B. We can just return Math.max(0, max - min - 2 * K) to get the result.
Time complexity: O(N)
Space complexity: O(1)
*/
