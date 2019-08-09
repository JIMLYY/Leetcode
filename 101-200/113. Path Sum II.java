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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> currentRes = new ArrayList<Integer>();
        helper(root, res, currentRes, sum);
        return res;
    }

    public void helper(TreeNode root, List<List<Integer>> res, List<Integer> currentRes, int sum){
        if(root == null){
            return;
        }
        currentRes.add(root.val);
        if(root.left == null && root.right == null && root.val == sum){
            res.add(new ArrayList(currentRes));
        }
        if(root.left != null){
            helper(root.left, res, currentRes, sum - root.val);
        }
        if(root.right != null){
            helper(root.right, res, currentRes, sum - root.val);
        }
        currentRes.remove(currentRes.size() - 1);
 /*
Topic: DFS
 */
