class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> results = new ArrayList<List<Integer>>();
        if(candidates == null || candidates.length == 0 || target <= 0) return results;
        Arrays.sort(candidates);
        combinationSumHelper(candidates, target, 0, results, new ArrayList());
        return results;
    }


    private void combinationSumHelper(int[]candidates, int target, int index, List<List<Integer>> results, List<Integer> curSeq){
            if(target == 0){
                // creat new list<Integer> save current "curSeq", which should not be modified latter
                results.add(new ArrayList<Integer>(curSeq));
            }else if (target > 0){
                for(int i = index; i < candidates.length; i++){
                    if(candidates[i] > target) break;
                    curSeq.add(candidates[i]);
                    combinationSumHelper(candidates, target - candidates[i], i, results, curSeq);
                    curSeq.remove(curSeq.size()-1);
                }
            }
        }
}
