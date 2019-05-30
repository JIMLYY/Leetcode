class Solution {
    public int countBattleships(char[][] board) {
        int row = board.length;
        int col = board[0].length;
        int count = 0;
        for(int i=0; i<row; i++)
            for(int j=0; j<col; j++)
                if(board[i][j]=='X' && (i == 0 || board[i - 1][j] == '.'  ) &&(j == 0 || board[i][j - 1] == '.'))
                    count ++;

        return count;
    }
}

/*  1. Topic: Array
    2. Explanation
    This question seems to be pretty hard. However, it turned out to be
    eaiser if we could find the trick. Actually, all we need to do is iterating
    the 2D board and check every element. If the element is "X" and it is not
    adjacent to another "X" on the top and left, we would consider it as
    a battleships.
*/
