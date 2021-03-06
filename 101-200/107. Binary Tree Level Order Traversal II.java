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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(root == null){
            return result;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            List <Integer> list = new ArrayList<Integer>();
            int size = q.size();
            for(int i = 0; i < size; i++){
                TreeNode node = q.poll();
                list.add(node.val);
                if(node.left != null){
                    q.add(node.left);
                }
                if(node.right != null){
                    q.add(node.right);
                }

            }
            result.add(0,list);
        }
        return result;
    }
}

/*
Topic: Tree
Algorithms: BFS
Time: O(N)
Space: O(N)
*/
