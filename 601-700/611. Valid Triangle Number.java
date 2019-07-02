// Method 1: brute-force
class Solution {
    public int triangleNumber(int[] nums) {
        int count = 0;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                for(int k = j + 1; k < nums.length; k++){
                    if(nums[i] + nums[j] > nums[k]) count ++;
                }
            }
        }
        return count;
    }
}
/*
Topic: array
Method 1: brute-force
1. sort the Array
2. check every possible combination
3. if  side a  + side b > side c  they can make a triangle
Time: O(N^3)
Space: O(1)
*/

// Method 2: two pointers
class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int left, right, count = 0;
        if(nums == null || nums.length < 3) return count;
        for(int i = 0; i < nums.length; i++){
            left = 0;
            right = i - 1;
            while(left < right){
                if(nums[left] + nums[right] > nums[i]){
                    count += right - left;
                    right --;
                }else{
                    left ++;
                }
            }
        }
        return count;
    }
}
/*
Topic: array & two pointers
Method 2: two pointers
This is questions is quite similar to 259. 3Sum Smaller. Please compare this question
with 259, and try to find the difference for yourself.
Time: O(N^2)
Space: O(1)
*/


// 259

// Method 1 brute force
class Solution {
    public int threeSumSmaller(int[] nums, int target) {
        if(nums.length < 3) return 0;
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                for(int k = j + 1; k < nums.length; k++){
                    if(nums[i] + nums[j] + nums[k] < target) count ++;
                }
            }
        }
        return count;
    }
}
/*
Topic: array, two-pointers
Method 1: brute-force
Time: O(N^3)
Space: O(1)
*/
// Method 2 two pointers
class Solution {
    public int threeSumSmaller(int[] nums, int target) {
        int count = 0;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2; i++){
            int left = i + 1, right = nums.length -1;
            while(left < right){
                if(nums[i] + nums[left] + nums[right] < target){
                    count += right - left;
                    left ++;
                }else{
                    right --;
                }
            }
        }
        return count;
    }
}
/*
Topic: array, two-pointers
Method 2: two pointers
1. Sort array in order to perform two pointers method.
2. the code may not seem to be very intuitive. Think this way, we perform
two pointes method for every subarray of original array.
3. Since the array is sorted, if we can find 3 sum < target, it means every number
between right and left pointer can serve as right. Therefore, we use count += right - left;
Otherwise, we just increase right by 1.
Time: O(N^2)
Space: O(1)
*/
