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
    Set<Integer> set;
    public int findSecondMinimumValue(TreeNode root) {
        set = new HashSet<Integer>();
        dfs(root);
        int min = root.val;
        long res = Long.MAX_VALUE;
        for(int v: set){
            if(v > min && v < res){
                res = v;
            }
        }
        return res< Long.MAX_VALUE? (int)res : -1;
    }

    public void dfs(TreeNode node){
        if(node != null){
        dfs(node.left);
        set.add(node.val);
        dfs(node.right);
        }
    }
}
/*
Topic: Tree
Algorithms: dfs
Time: O(N)
Space: O(N)
N is the total number of nodes in the given tree
*/
