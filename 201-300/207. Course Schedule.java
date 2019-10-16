class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] inDegree = new int[numCourses];
        HashMap<Integer, List<Integer>> graph = new HashMap<>();
        Queue<Integer> q = new LinkedList<Integer>();
        for(int i = 0; i < prerequisites.length; i++){
            inDegree[prerequisites[i][0]]++;
            if(graph.containsKey(prerequisites[i][1])){
                graph.get(prerequisites[i][1]).add(prerequisites[i][0]);
            }else{
                List<Integer> list = new ArrayList<>();
                list.add(prerequisites[i][0]);
                graph.put(prerequisites[i][1], list);
            }
        }
        for(int i = 0; i < numCourses; i++){
            if(inDegree[i] == 0){
                q.offer(i);
            }
        }

        while(! q.isEmpty()){
            Integer n = q.poll();
            List<Integer> linkedCourses = graph.get(n);
            for(int i = 0; linkedCourses != null && i < linkedCourses.size(); i++){
                if(--inDegree[linkedCourses.get(i)] == 0){
                    q.offer(linkedCourses.get(i));
                }
            }
        }
        for(int i = 0; i < numCourses; i++){
            if(inDegree[i] != 0){
                return false;
            }
        }
        return true;
    }
}

/*
Topic: BFS & DFS & graph & topological sorting
Algorithms: the way I solve this problem is using BFS in combination of graph basics.
1. Store the indegree
2. Store the graph (the relationship between courses)
3. Add all courses with 0 in degree into the queue
4. While queue is not empty, decrease the in degree of linked courses
5. if all courses have 0 in degree, return true. Otherwise, return false

Time complexity: O(N)
Space complexity: O(N)
*/
