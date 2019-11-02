class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> result = new ArrayList<>();

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>(){
            @Override
            public int compare(Integer a, Integer b){
                return map.get(a) - map.get(b);
            }
        });

        for(int num : map.keySet()){
            if(pq.size() < k){
                pq.add(num);
            }else{
                if(map.get(num) > map.get(pq.peek())){
                    pq.remove();
                    pq.add(num);
                }
            }
        }

        while(!pq.isEmpty()){
            result.add(pq.remove());
        }

        return result;
    }
}

/*
Topic: Hash Table &7 Heap
Algorithms:
1. Store the values of given array into a HashMap.
   Key is the element, Value is the number of concurrence.
2. Maintain a PriorityQueue with the Comparator sorting the element
  based on the number of concurrences in a ascending order
3. Iterate the keySet
4. Maintain top of K elements in PriorityQueue

Time complexity: O(N)
Space complexity: O(N)

*/
