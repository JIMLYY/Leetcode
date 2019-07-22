class Solution {
    public int longestMountain(int[] A) {
        int up = 0, down = 0, res = 0;
        for(int i = 1; i < A.length; i++){
            // set 'up' and 'down' to zero to start a new mountain
            if(down > 0 && A[i] > A[i - 1] || A[i] == A[i - 1]){
                up = 0;
                down = 0;
            }
            // climbing the mountain
            if(A[i] > A[i - 1]){
                up++;
            }
            // do down the mountain
            if(A[i] < A[i - 1]){
                down++;
            }
            // compared and find the larger result
            if(up > 0 && down > 0 && up + down + 1 > res){
                res = up + down + 1;
            }
        }
        return res;
    }
}
/*
Topic: two pointers
Time: O(n)
Space: O(1)
*/
