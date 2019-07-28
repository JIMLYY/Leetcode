class Solution {
    public int distributeCandies(int[] candies) {
        Set<Integer> set = new HashSet<Integer>();
        for(int candy : candies){
            set.add(candy);
        }
        int half = candies.length / 2;
        return set.size() >= half? half : set.size();
    }
}
/*
Topic: Hashtable
Algorithms:
1. use hashset to get the number of types of candies
2. check if it is larger than half since the maxium types of
candies the sister can get is half.
3. if it is greater than half, return half.
4. if not, return the size of hashset.
Time: O(N)
Space: O(N)
*/
