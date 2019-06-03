class Solution(object):
    def hammingWeight(self, n):
        """
        :type n: int
        :rtype: int
        """
        return bin(n).count("1")

class Solution(object):
    def hammingWeight(self, n):
        """
        :type n: int
        :rtype: int
        """
        c = 0
        while n:
            n &= n-1
            c += 1
        return c

"""
Topic: Bit Manipulation
Method 1: use built-in bin() function to convert and
return the binary equivalent string of a given integer
and count the "1"

Method 2: use the trick
if n = XXXXXX1000 and n - 1 is XXXXXX0111, n & (n - 1) will be XXXXXX0000
which is just cancel the last 1
Meanwhile, we use c to track how many "1" has been canceledself.
Inspired by https://leetcode.com/problems/number-of-1-bits/discuss/55106/Python-2-solutions.-One-naive-solution-with-built-in-functions.-One-trick-with-bit-operation
"""
