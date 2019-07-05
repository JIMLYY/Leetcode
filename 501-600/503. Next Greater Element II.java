// Method 1 brute-force :
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int [] res = new int [nums.length];
        int [] doublenums = new int [nums.length * 2];
        System.arraycopy(nums, 0, doublenums, 0, nums.length);
        System.arraycopy(nums, 0, doublenums, nums.length, nums.length);

        for(int i = 0; i < nums.length; i++){
            res[i] = -1;
            for(int j = i + 1; j < doublenums.length; j++){
                if(doublenums[j] > doublenums[i]){
                    res[i] = doublenums[j];
                    break;
                }
            }
        }
        return res;
    }
}
/*
Topic: array & stack
Method 1:  we use a new array doublenums which is formed by concatenating two copies of the given nums array one after the other.
Then, all we need to do is for each number in nums, finding out the next greater element by searching array doublenums.
Time: O(N^2) The complete doublenums array(2 * nums.length) is scanned for all number in nums in the worst case.
Space: O(N) doublenums is an array of size 2*n; res is an array with size of n.
Reference: solution by @vinod23
*/

// Method 2 brute-force :
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int [] res = new int [nums.length];

        for(int i = 0; i < nums.length; i++){
            res[i] = -1;
            for(int j = 1; j < nums.length; j++){
                if(nums[(i + j) % nums.length] > nums[i]){
                    res[i] = nums[(i + j) % nums.length];
                    break;
                }
            }
        }
        return res;
    }
}
/*
Topic: array & stack
Method 2: instead of making a doublenums, we can simply traverse circularly in the nums array by using % operator.
Time: O(N^2)
Space: O(N)  res is an array with size of n.
Reference: solution by @vinod23
*/
