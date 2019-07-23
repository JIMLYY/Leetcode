class Solution {
    public int findMinDifference(List<String> timePoints) {
        boolean [] mask = new boolean [24 * 60];
        for(String time : timePoints){
            String[] t = time.split(":");
            int hour = Integer.parseInt(t[0]);
            int minute = Integer.parseInt(t[1]);
            if(mask[hour * 60 + minute]){
                return 0;
            }
            mask[hour * 60 + minute] = true;
        }

        int first = Integer.MAX_VALUE, last = Integer.MIN_VALUE;
        int minDiff = Integer.MAX_VALUE, pre = 0;
        for(int i = 0; i < 24 * 60; i++){
            if(mask[i]){
                if(first != Integer.MAX_VALUE){
                    minDiff = Math.min(minDiff, i - pre);
                }
                first = Math.min(first, i);
                last = Math.max(last, i);
                pre = i;
            }
        }
        minDiff = Math.min(minDiff, (24 * 60 - last + first));
        return minDiff;
    }
}
/*
Topic: String
Algorithms: this quesiton is just for fun.
1. creat a boolean array to mark every single minute.
2. Then iterate the array again and determine the minDiffenece
3. be careful with the return since 24 * 60 - last + first could be smaller that mindiff
Time: O(N)
Space: O(N)
*/
