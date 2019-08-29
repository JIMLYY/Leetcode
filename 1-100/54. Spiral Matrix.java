class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) return new LinkedList<Integer>();
        LinkedList<Integer> res = new LinkedList<Integer>();
        int left = 0, right = matrix[0].length - 1;
        int top = 0, bottom = matrix.length - 1;
        while(left < right && top < bottom){
            for(int i = left; i < right; i++) res.add(matrix[top][i]);
            for(int i = top; i < bottom; i++) res.add(matrix[i][right]);
            for(int i = right; i > left; i--) res.add(matrix[bottom][i]);
            for(int i = bottom; i > top; i--) res.add(matrix[i][left]);
            left ++;
            right --;
            top ++;
            bottom --;
        }

        if(left == right){
            for(int i = top; i <= bottom; i++) res.add(matrix[i][left]);
        } else if (top == bottom){
            for(int i = left; i <= right; i++) res.add(matrix[top][i]);
        }
        return res;

    }
}
/*
Topic: Array
Time: O(N) N is the total number of elements
Space: O(N)
*/
