class Solution {
    public int orangesRotting(int[][] grid) {
        if(grid == null || grid.length == 0){
            return 0;
        }
        int rows = grid.length;
        int cols = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        int numOfFresh = 0;
        for(int row = 0; row < rows; row++){
            for(int col = 0; col < cols; col++){
                if(grid[row][col] == 2){
                    q.add(new int[]{row, col});
                }else if(grid[row][col] == 1){
                    numOfFresh ++;
                }
            }
        }

        if(numOfFresh == 0){
            return 0;
        }
        int minute = 0;
        int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};
        while(!q.isEmpty()){
            ++minute;
            int size = q.size();
            for(int i = 0 ; i < size; i++){
                int[] point = q.poll();
                int r = point[0];
                int c = point[1];
                for(int[] direction : directions){
                    int row = r + direction[0];
                    int col = c + direction[1];
                    if(row < 0 || col < 0 || row >= rows || col >= cols || grid[row][col] == 0 || grid[row][col] == 2){
                        continue;
                    }
                    grid[row][col] = 2;
                    q.add(new int[]{row, col});
                    numOfFresh --;
                }
            }
        }
        return numOfFresh == 0? minute - 1 : -1;
    }
}

/*
Topic: Breath-first Search
Algorithms: this is a typical BFS problem. Initially, the rotten oranges have 
'depth' 0, and the neighbors increase depth by 1 every time rotten oranges rot
a neighbor.
Time: O(N) N is the number of cells in the grid
Space: O(N)
*/
