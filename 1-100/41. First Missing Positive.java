class Solution {
    public int firstMissingPositive(int[] nums) {
        if(nums == null || nums.length == 0) return 1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] <= 0){
                nums[i] = Integer.MAX_VALUE;
            }
        }
        for(int i = 0; i < nums.length; i++){
            int num = Math.abs(nums[i]);
            if(num <= nums.length){
                nums[num - 1] = -Math.abs(nums[num - 1]);
            }
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                return i + 1;
            }
        }
        return nums.length + 1;
    }
}

/*
Topic: Array
Method: The idea is to use the postive number in the Array
as index to set corresponding element to negative. Then, iterate
the resulting array, the first postive element is the one we want.

Fist of all, set the element as Integer.MAX_VALUE if it is <= 0.
Then, if(num <= nums.length), we set  the number at [num-1], nums[num - 1], to
negative.
Finally, we iterate the modified array again, and find the first postive number.
That index + 1 is the number we are looking for.

To help you understand
index:                0 , 1 , 2, 3 , 4......
corresponding number: 1 , 2, 3 , 4 , 5......
TC: O(n)
SC: O(1)
*/
