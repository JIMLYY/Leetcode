class Solution {
    public int sumOfDigits(int[] A) {
        int min = Integer.MAX_VALUE;
        int res = 0;

        for(int num : A){
            if(num < min){
                min = num;
            }
        }

        while(min != 0){
            int digit = min % 10;
            res += digit;
            min /= 10;
        }
        return 1 - res%2;
    }
}

/*
Topic: array
Algorithms: a straightforward question.
1. finf the minimum number
2. get sum of digits
3. determine if it is odd or not
Time: O(N)
Space: O(1)
*/
