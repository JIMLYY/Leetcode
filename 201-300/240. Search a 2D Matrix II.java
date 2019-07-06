class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0 || matrix[0].length ==0) return false;
        int row = matrix.length;
        int col = matrix[0].length;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(matrix[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }
}
/*
1. Topic binary search % divide and conquer
2. Method 1. brute force
3. Time: O(N^2) (O(m * n))
we perform a constant time operation for each element of an n * m element matirx,
the overall time conplexity is the size of matrix.
4. Space O(1)
*/


class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // start the "pointer" in bottom-left corner

        int row = matrix.length - 1, col = 0;
        while(row >= 0 &&  col < matrix[0].length){
            if(matrix[row][col] < target){
                col += 1;
            }else if(matrix[row][col] > target){
                row -= 1;
            }else{
                return true;
            }
        }
        return false;
    }
}

/*
1. Topic binary search % divide and conquer
2. Method 2. Search space reduction
3. Time: O(m + n)
Before we find the right answer (if it exists), either row or col is decremented/
incremented exactly once. Also, we cannot get out of matrix since the condition of
while loop. The loop cannot run more than m + n iterations.
4. Space O(1)
*/
