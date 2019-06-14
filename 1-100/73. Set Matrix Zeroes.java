class Solution {
    public void setZeroes(int[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) return;
        boolean firstRowZero = false;
        boolean firstColZero = false;
        for(int i = 0; i < matrix[0].length; i++){
            if(matrix[0][i] == 0){
                firstRowZero = true;
                break;
            }
        }

        for(int i = 0; i < matrix.length; i++){
            if(matrix[i][0] == 0){
                firstColZero = true;
                break;
            }
        }

        for(int x = 1; x < matrix[0].length; x++){
            for(int y = 1; y < matrix.length; y++){
                if(matrix[y][x] == 0){
                    matrix[y][0] = 0;
                    matrix[0][x] = 0;
                }
            }
        }

        for(int i = 1; i < matrix[0].length; i++){
            if(matrix[0][i] == 0){
                for(int j = 1; j < matrix.length; j++) matrix[j][i] = 0;
            }
        }

        for(int i = 0; i < matrix.length; i++){
            if(matrix[i][0] == 0){
                for(int j = 1; j < matrix[0].length; j++) matrix[i][j] = 0;
            }
        }

        if(firstRowZero) for(int j = 0; j < matrix[0].length; j++) matrix[0][j] = 0;
        if(firstColZero) for(int j = 0; j < matrix.length; j++) matrix[j][0] = 0;
    }
}

/*
Topic: array
Method: First, use boolean firstRowZero and firstColZero to remember if the first
column or first row has 0. If yes, set corresponding value to true. Then, use the 
first row and first column to store which a row or a column has 0. Then,
iterate the first row and column seperately. If a 0 is found, set the whole row or
column to 0. Then check firstRowZero and firstColZero to determine if the first
row or column should be 0.
TC: O(M X N)
SC: 0(1)
*/
