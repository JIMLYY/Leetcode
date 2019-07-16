class Solution {
    public String removeVowels(String S) {
        Set <Character> set = new HashSet<>();
        for(char c : "aeiou".toCharArray()){
            set.add(c);
        }
        StringBuilder sb = new StringBuilder();
        for(char c: S.toCharArray()){
            if(!set.contains(c)){
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
/*
Topic: String
Method 1
Algorithms: store the vowels in a set. iterate every character of string. If a
character is not in vowels, we keep it. Otherwise, we keep going.
Time: O(N)
Space: O(N)
*/

class Solution {
    public String removeVowels(String S) {
        return S.replaceAll("[a,e,i,o,u]","");
    }
}
// Method 2: use a built-in function
