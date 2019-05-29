class Solution {
    public boolean canPermutePalindrome(String s) {
        Set<Character> set = new HashSet<Character>();
        int len = s.length();
        for(int i = 0;  i < len; i++){
            if(set.contains(s.charAt(i))) set.remove(s.charAt(i));
            else
                set.add(s.charAt(i));
        }
        return set.size() == 0 || set.size() ==1;
    }
}

// Topic: Hash Table
// Method: Use set
/* Explanation: iterate over string.
                add character to set if set does not contain that character
                remove character if set already contains that character
                check if the size equals 0 or 1
                0: even number of any character in the string
                1: even number of any character except one or just one character with odd number
*/
