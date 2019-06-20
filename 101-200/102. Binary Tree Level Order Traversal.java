/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        if(root == null) return result;
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            LinkedList<Integer> list = new LinkedList<Integer>();
            for(int i = 0; i < size; i++){
                TreeNode node = queue.pop();
                list.add(node.val);
                if(node.left != null) queue.offer(node.left);
                if(node.right != null) queue.offer(node.right);
            }
            result.add(list);
        }
        return result;
    }
}
/*
Topic: Tree, BFS
Method: we use queue structure.
while queue is not empty:
1. calculate the size of current level
2. pop out all these elements from queue and add them into current level.
3. Push their child nodes into queue for next level.
4. add list, which store all the value of current level.

Time complexity: O(n) since each node is processed exactly once.
Space complexity: O(n) keep the output strcture which contains N node values.
*/
