class Solution:
    def canPermutePalindrome(self, s: str) -> bool:
        chance = 1
        count = collections.Counter(s)
        print(count)
        for letter in set(s):
            if count[letter] % 2 == 1:
                chance -= 1
                print(chance)
            if chance < 0:
                return False
        return True

    """
    The idea is simple: count the number of each character.
    and iterate through the count to check number
    if number is even, it always can be used
    if number is odd, it one of its character must be in the center.
    if another character wiht odd number shows up.
    Palindrome cannot be formed.
    """
