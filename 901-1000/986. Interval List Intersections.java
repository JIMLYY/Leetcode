class Solution {
    public int[][] intervalIntersection(int[][] A, int[][] B) {
        List<int[]> ans = new ArrayList<>();
        // Two pointers
        int i = 0, j = 0;
        // move two pointers while creating the new int[]
        while(i < A.length && j < B.length){
            // determine the start and end of a new int []
            int start = Math.max(A[i][0], B[j][0]);
            int end = Math.min(A[i][1], B[j][1]);
            // test if the new int [] exists
            if(start <= end) ans.add(new int[]{start,end});
            // move the pointers
            if(A[i][1] > B[j][1]) j++;
            else i++;
        }
        // create res
        int[][] res = new int[ans.size()][2];
        int idx = 0;
        for(int[] element:ans){
            res[idx++] = element;
        }
        return res;
    }
}
/*
Topic: two pointers
Time complexity: O(N)
Space complexity:O(N)
*/
