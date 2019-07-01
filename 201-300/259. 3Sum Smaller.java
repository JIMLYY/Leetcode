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
