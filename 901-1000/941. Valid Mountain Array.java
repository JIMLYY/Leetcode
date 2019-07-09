class Solution {
    public boolean validMountainArray(int[] A) {
        int i = 0;
        int len = A.length;

        // walk up
        while (i < len - 1 && A[i] < A[i + 1]){
            i++;
        }

        // the "peak" cannot be the first or last one
        if (i == 0 || i == len -1){
            return false;
        }

        // walk down
        while (i < len - 1 && A[i] > A[i + 1] ){
            i++;
        }

        return i == len - 1;
    }
}

/*
Topic : Array
Algorithm: we can just intuitively climb the mountain from left to right until we cannot. That point has to be
the peak. Then, we rule out the possibility that this peak is the first or last point. Then we climb dowm, and compare the size to see if we have reached the end.
Time: O(N) N is the length of A
Space: O(1)
*/
