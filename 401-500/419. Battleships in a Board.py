class Solution:
    def countBattleships(self, board: List[List[str]]) -> int:
        row = len(board)
        col = len(board[0])
        count = 0

        if row == 0 or col == 0:
            return 0

        for i in range(row):
            for j in range(col):
                if board[i][j] == "X" and (i==0 or board[i-1][j] == ".") and (j==0 or board[i][j-1] == "."):
                    count += 1
        return count

    """
    This question seems to be pretty hard. However, it turned out to be
    eaiser if we could find the trick. Actually, all we need to do is iterating
    the 2D board and check every element. If the element is "X" and it is not
    adjacent to another "X" on the top and left, we would consider it as
    a battleships.
    """
