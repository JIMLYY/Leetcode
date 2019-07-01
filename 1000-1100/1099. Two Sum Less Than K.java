// Method 1
class Solution {
    public int twoSumLessThanK(int[] A, int K) {
        int max = -Integer.MAX_VALUE;
        for(int i = 0; i < A.length; i++){
            for(int j = i + 1; j < A.length; j++){
                if(A[i] + A[j] > max && A[i] + A[j] < K){
                    max = A[i] + A[j];
                }
            }
        }
        if(max != -Integer.MAX_VALUE){
            return max;
        }else{
            return -1;
        }
    }
}
// Method 1.1 a litte more readable

class Solution {
    public int twoSumLessThanK(int[] A, int K) {
        int max = -1;
        for(int i = 0; i < A.length; i++){
            for(int j = i + 1; j < A.length; j++){
                if(A[i] + A[j] > max && A[i] + A[j] < K){
                    max = A[i] + A[j];
                }
            }
        }
        return max;
    }
}
/*
Topic: array
Method 1: check every combination
Time: O(N^2)
Space: O(1)
*/

// Method 2: two pointers
class Solution {
    public int twoSumLessThanK(int[] A, int K) {
        Arrays.sort(A);
        int start = 0, end = A.length - 1;
        int max = -1;
        while(start < end){
            int temp = A[start] + A[end];
            if(temp < K){
                max = Math.max(temp,max);
                start ++ ;
            }else{
                end --;
            }
        }
        return max;
    }
}
/*
Topic: array
Method 2: two pointers
Sort the array first. Then, use two pointers to point to
start and end of array respectively. If the number obtained by
adding two numbers that pointers point to is less than K, we check
temp and max to see if we can update max. Eventually, return max.
Time: O(N)
Space: O(1)
*/
