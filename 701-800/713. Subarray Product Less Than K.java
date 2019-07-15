class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int mul = 1, count = 0;
        if(k == 0) return count;
        for(int j = 0, i = 0; i < nums.length; i++){
            mul *= nums[i];
            while(mul >= k && j <=i){
                mul /= nums[j];
                j ++;
            }
            count += i - j + 1;
        }
        return count;
    }
}
/*
Topic: Array and two pointers
Algorithms: sliding windows.
1. find a max-product-window less than K in each iteration
2. every time we shift the window by timing a new number on the right(index is i).
3. If it is greater than k, then we will try to get the product divided by left(j)
,until the subarray product is less than k
4. update the count
Time: O(N). N is the length of nums. Left can only be incremented N times.
Space: O(1)
*/
