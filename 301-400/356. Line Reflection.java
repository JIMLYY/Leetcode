class Solution {
    public boolean isReflected(int[][] points) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        HashSet<String> set = new HashSet<>();
        String temp;
        for(int[] point: points){
            if(point[0] > max){
                max = point[0];
            }
            if(point[0] < min){
                min = point[0];
            }
            set.add(point[0] + "a" + point[1]);
        }
        int sum = max + min;
        for(int[]point: points){
            temp = (sum - point[0]) + "a" + point[1];
            if(!set.contains(temp)){
                return false;
            }
        }
        return true;
    }
}
/*
Topic: HashSet, Math
Time: O(N)
Space: O(N)
*/
