class Solution {
    public int projectionArea(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int res = 0;
        int count = 0;

        // find largest number in each column
        for(int j = 0; j < col; j++){
            int temp = 0;
            for(int i = 0; i < row; i++){
            if(grid[i][j] > temp) temp = grid[i][j];
            }
            res += temp;
        }

        // find largest number in each row and record the number of grids occupied by cubes
        for(int i = 0; i < row; i++){
            int temp = 0;
            for(int j = 0; j < col; j++){
            if(grid[i][j] > temp) temp = grid[i][j];
            if(grid[i][j] > 0) count++;
            }
            res += temp;
        }

        res += count;
        return res;
    }
}

/*
Topic: array, math
Method: brute-force.
1. Iterate 2D array, find largest number in each column
2. Add to res
3. find largest number in each row and record the number of grids occupied by cubes
4. Add to res

Time Complexity: O(N^2)
Space Complexity: O(1)
*/
