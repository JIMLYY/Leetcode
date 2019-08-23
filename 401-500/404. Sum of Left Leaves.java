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
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null || root.left == null && root.right == null){
            return 0;
        }
        int res = 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(! q.isEmpty()){
            TreeNode node = q.poll();
            if(node.left != null && node.left.left == null && node.left.right == null ){
                res += node.left.val;
            }
            if(node.left != null){
                q.offer(node.left);
            }
            if(node.right != null){
                q.offer(node.right);
            }
        }
        return res;
    }
}

/*
Topic: Tree
Algorithms: BFS
Time: O(N) We iterate every node exactly once.
Space: O(W) maximum width of the tree
*/
