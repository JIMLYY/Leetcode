class Solution {
    public int maxProduct(int[] nums) {
        int up = nums[0], down = nums[0], length = nums.length, res = nums[0];
        for (int i = 1; i < length; i++){
            int up_pre = up, down_pre = down;
            if(nums[i]>0){
                up = Math.max(up_pre*nums[i],nums[i]);
                down = Math.min(down_pre*nums[i],nums[i]);
            }
            else{
                up = Math.max(down_pre*nums[i],nums[i]);
                down = Math.min(up_pre*nums[i],nums[i]);
            }
            res = Math.max(res, up);
        }
        return res;
    }
}

/*
Topic: Dynamice programming (DP) and array
TC: O(n) SC: O(1)
Method: iterate array and use 'up' and 'down' to record max and min
product among the subarrays whose last element is nums[i]. Compare up with res
every iteration. Return res eventually.
*/
