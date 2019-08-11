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
    List<Integer> list;
    public int kthSmallest(TreeNode root, int k) {
        list = new ArrayList<>();
        dfs(root);
        return list.get(k-1);
    }
    public void dfs(TreeNode node){
        if(node == null){
            return;
        }
        dfs(node.left);
        list.add(node.val);
        dfs(node.right);
    }
}
/*
Topic: tree
Alogrithms: inorder traversal
Time: O(N)
Space: O(N)
*/
