class Solution {
    public String replaceWords(List<String> dict, String sentence) {
        if(dict == null || dict.size() == 0){
            return sentence;
        }
        StringBuilder sb = new StringBuilder();
        Set<String> set = new HashSet<>();
        for(String root : dict){
            set.add(root);
        }
        String[] words= sentence.split("\\s+");
        for(String word : words){
            String prefix = "";
            for(int i = 0; i <= word.length(); i++){
                prefix = word.substring(0,i);
                if(set.contains(prefix)){
                    break;
                }
            }
            sb.append(" " + prefix);

        }
        return sb.deleteCharAt(0).toString();
    }
}
/*
Topic: Hahtable Trie
Algorithms: store all the roots in a Set structure. For each word,
we check the successive prefix of that word. If you can find a prefix in the
hashset. We replace the word with that prefix. Otherwise, the word itself will be
the "prefix". Add that to the final result.
Time: O(∑Wi^2) where Wi is the length of the ii-th word.
Space: O(N)
*/
