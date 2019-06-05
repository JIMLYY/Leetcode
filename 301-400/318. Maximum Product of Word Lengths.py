'''
318. Maximum Product of Word Lengths
'''
# 1
class Solution:
    def maxProduct(self, words: List[str]) -> int:
        dic_words= {}
        for word in words:
            dic_words[word] = set(word)
        l = len(words)
        max_length = 0
        for i in range(l):
            for j in range(i,l):
                word_1 = words[i]
                word_2 = words[j]
                if not (dic_words[word_1] & dic_words[word_2]):
                    max_length = max (max_length, len(word_1) * len(word_2))

        return max_length
# 2
class Solution:
    def maxProduct(self, words: List[str]) -> int:
        length = len(words)
        word_bit = [0] * length
        max_length = 0
        for index, word in enumerate(words):
            for char in word:
                word_bit[index] = word_bit[index] | 1 <<(ord(char) - 97)
                # 97 is ord('a')

        for i in range(length):
            for j in range(i,length):
                if not (word_bit[i] & word_bit[j]):
                    max_length = max(max_length, len(words[i] * len(words[j])))
        return max_length
'''
Topic: Bit Manipulation
Method 1: brute force
use dictionary to store the word and corresponding set of characters
Then use nested "for loop" to check every combination of word_1 and word_2
If they have no characters in common, then update the length. Eventually.
return the max length.
TC: O(n**2) SC: O(n)
Method 2: Bit Manipulation
The basic idea is to use bit to represent the words. Then use word_bit[i] & word_bit[j]
to check if two words have characters in common. Because if had have characters in common,
they result would not be 0.
TC: O(n**2) SC: O(n)
'''
