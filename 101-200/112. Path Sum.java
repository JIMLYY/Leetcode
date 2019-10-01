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
    public boolean hasPathSum(TreeNode root, int sum) {
        if( root == null){
            return false;
        }
        if(root.left == null && root.right ==null && root.val == sum){
            return true;
        }
        else{
            return hasPathSum(root.left,sum-root.val) || hasPathSum(root.right,sum-root.val);
        }

    }
}
/*
Topic: DFS
Time: O(N) where N is the number of nodes
Space: O(log(N))
*/
