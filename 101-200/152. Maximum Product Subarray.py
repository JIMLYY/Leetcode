class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        if not nums:
            return 0
        l = len(nums)
        up = down = nums[0]
        res= nums[0]

        for i in range(1,l):
            up_pre = up
            down_pre = down
            up = max(up_pre*nums[i],nums[i],down_pre*nums[i])
            down = min(up_pre*nums[i],nums[i],down_pre*nums[i])
            res = max(res,up)
        return res

"""
Topic: Dynamice programming (DP) and array
TC: O(n) SC: O(1)
Method: iterate array and use 'up' and 'down' to record max and min
product among the subarrays whose last element is nums[i]. Compare up with res
every iteration. Return res eventually.
"""
