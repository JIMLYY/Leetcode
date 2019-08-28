/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {}

    public Node(int _val,List<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
};
*/
class Solution {
    public Node cloneGraph(Node node) {
        if(node == null) return null;
        Queue<Node> q = new LinkedList<>();
        Map<Integer, Node> map = new HashMap<>();
        q.add(node);
        map.put(node.val, new Node(node.val, new ArrayList<Node>()));
        while(!q.isEmpty()) {
            Node cur = q.remove();
            for(Node n : cur.neighbors) {
                if(map.get(n.val) == null) {
                    map.put(n.val, new Node(n.val, new ArrayList<Node>()));
                    q.add(n);
                }
                map.get(cur.val).neighbors.add(map.get(n.val));
            }
        }

        return map.get(node.val);

    }
}
/*
Topic: graph
Algorithms: BFS
Time: O(N)
Space: O(M)
*/
