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
    Integer res, prev;
    public int getMinimumDifference(TreeNode root) {
        res = Integer.MAX_VALUE;
        prev = null;
        dfs(root);
        return res;
    }

    public void dfs(TreeNode node){
        if(node == null){
            return;
        }
        dfs(node.left);
        if(prev != null){
            res = Math.min(res, Math.abs(node.val - prev));
        }
        prev = node.val;
        dfs(node.right);
    }
}
