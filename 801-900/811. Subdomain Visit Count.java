class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> counts = new HashMap<String, Integer>();
        for(String domain:cpdomains){
            String[] cpinfo = domain.split("\\s+");
            String[] frags = cpinfo[1].split("\\.");
            int count = Integer.valueOf(cpinfo[0]);
            String curr = "";
            for(int i = frags.length - 1; i >= 0; i--){
                curr = frags[i] + (i < frags.length - 1? "." : "") + curr;
                counts.put(curr, counts.getOrDefault(curr,0) + count);
            }
        }

        List<String> ans = new ArrayList();
        for(String dom : counts.keySet()){
            ans.add("" + counts.get(dom) + " " + dom);
        }
        return ans;
    }
}

/*
Topic: hash table
Method:
Time Complexity:O(N), where N is the length of cpdomains, and assuming the length of cpdomains[i] is fixed.
Space Compexity O(N)
reference: leecode solution
*/
