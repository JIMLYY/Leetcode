class Solution {
    public boolean isValidSudoku(char[][] board) {
        if(board == null || board.length != 9 || board[0].length != 9) return false; // should be 9 X 9

        // checl each row;
        for(int row = 0; row < 9; row++){
            boolean[] taken = new boolean[9];
            for(int idx = 0; idx < 9; idx++){
                char c = board[row][idx];
                if(c != '.'){
                    int num = c - '1';
                    if(taken[num] == true) return false;
                    else taken[num] = true;
                }
            }
        }

        // check each column
        for(int col = 0; col < 9; col ++){
            boolean[] taken = new boolean[9];
            for(int idx = 0; idx < 9; idx++){
                char c = board[idx][col];
                if(c != '.'){
                    int num = c - '1';
                    if(taken[num] == true) return false;
                    else taken[num] = true;
                }
            }
        }

        // check 3 * 3 boxes
        for(int box = 0; box < 9; box++){
            boolean[] taken = new boolean[9];
            for(int row = 0; row < 3; row++){
                for(int col = 0; col < 3; col++){
                    char c = board[row + 3 * (box / 3)][col + 3 * (box % 3)];
                    if(c != '.'){
                        int num = c - '1';
                        if(taken[num] == true) return false;
                        taken[num] = true;
                    }
                }
            }
        }
        return true;
    }
}

/*
Topic: array
Method: (brute-force)The idea is simple, we check every row, every column and every 3x3 box respectively.
In each iteration, we use a boolean list to check if a number has appeared more than once.
TC:
SC:
*/
