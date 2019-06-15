class Solution {
    public int[][] generateMatrix(int n) {
        int [][] results = new int[n][n];
        if(n <= 0) return results;
        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;
        int k = 1;
        while(top < bottom && left < right){
            for(int i = left; i < right; i++){
                results[top][i] = k++;
            }
            for(int i = top; i < bottom; i++){
                results[i][right] = k++;
            }
            for(int i = right; i > left; i--){
                results[bottom][i] = k++;
            }
            for(int i = bottom; i > top; i--){
                results[i][left] = k++;
            }
            top ++;
            bottom --;
            left ++;
            right --;
        }
        if(n % 2 != 0) results[n/2][n/2] = k;
        return results;
    }
}
/*
Topic: Array
Method: while top < bottom && left < right, iterate through 2-D matrix in 4 direction respectively by using 4 "for loop". Then, check if n is even or odd, if n is odd, add the last number in the center of matrix.
TC: O(n^2)
SC: O(n^2)
*/
