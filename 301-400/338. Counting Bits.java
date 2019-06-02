338. Counting Bits
//1
class Solution {
    public int[] countBits(int num) {
        int [] res = new int [num + 1];
        int pow2 = 1, before = 1;
        for (int i = 1; i < num + 1; i++)
            if(i == pow2){
                res[i] = 1;
                pow2 <<= 1;
                before = 1;
            }else{
                res[i] = res[before] + 1;
                before ++;
            }
        return res;
    }
}
/*
Topic: DP and Bit Manipulation
Method: iterate through if i = 2**n, res[i] == 1;
otherwise treat i = 2**j + k (eg: 13 = 2**3 + 5)
Then, update the array.

TC: O(n) SC: O(n)

reference: https://www.hrwhisper.me/leetcode-counting-bits/
*/

//2
class Solution {
    public int[] countBits(int num) {
        int [] res = new int [num + 1];
        for (int i = 1; i < num + 1; i++)
            res[i] = res[i>>1] + (i&1);
        return res;
    }
}
