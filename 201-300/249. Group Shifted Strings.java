class Solution {
    public List<List<String>> groupStrings(String[] strings) {

        List<List<String>> result = new ArrayList<List<String>>();
        Map<String, List<String>> map = new HashMap<String,List<String>>();

        for(String str:strings){
            String key = "";
            for(int i=1; i < str.length(); i++){
                int offset = str.charAt(i) - str.charAt(i-1);
                key += offset < 0 ? offset +26: offset;
            }
            if(!map.containsKey(key))
                map.put(key, new ArrayList<String>());
            map.get(key).add(str);
        }

        for (List<String> list: map.values())
            result.add(list);
        return result;
    }
}

/*
Method 1: brute force
Topic: Hash Table & String
Explanation: The idea is simple: iterate through the array and check every element.
Generate key for each element. If the key is in the hasp table, put that string in
the table. If not, generate a new item based on the new key.
Finally, add the values of map into the result.
TC: O(n**2) SC: O(n)
*/
