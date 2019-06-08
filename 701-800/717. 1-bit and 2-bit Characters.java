717. 1-bit and 2-bit Characters
class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int i = 0;
        while(i < bits.length-1)
            i += bits[i] + 1;
        return i == bits.length -1;
    }
}

/*
Topic: Array
Method: if bits[i] == 0, the next character must have
1 bits. else if bits[i] == 1, the next character must
have 2 bits. we use "bits[i] + 1" to increment our read
pointer to the start of the next character. Eventually,
if our pointer is at bits.length - 1, the last character
must have size of 1 bit
TC: O(n)
SC: O(1) 
*/
