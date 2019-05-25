class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        
        # Topic: hash table

        # Note:be careful with the conditon "you may not use the same element twice."
        # therefore "dic[target - nums[i]] != i" is necessary
        
        dic = {}
        l = len(nums)
        for index,num in enumerate(nums):
            dic[num] = index
            
        for i in range(l):
            if target - nums[i] in dic and dic[target - nums[i]] != i:
                return [i, dic[target - nums[i]]]
            
