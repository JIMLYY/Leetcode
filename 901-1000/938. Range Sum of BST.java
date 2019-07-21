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
    int res = 0;
    public int rangeSumBST(TreeNode root, int L, int R) {
        return dfs(root, L, R);
    }
    public int dfs(TreeNode root, int L, int R){
        if(root == null){
            return 0;
        }
        else{
            if(root.val >= L && root.val <= R){
                res += root.val;
            }
            if(root.val > L){
                dfs(root.left, L, R);
            }
            if(root.val < R){
                dfs(root.right, L, R);
            }
        }
        return res;
    }
}
/*
Topic: tree & recursion
Algorithms: DFS
1. If value of a node falls in the range of [L,R], we will add it to the res
2. if the value > L, we use left child to continue dfs
3. if the value < R, we use right child to dfs
Time: O(N), where N is the number of nodes in the tree.
Space: O(H), where H is the height of the tree.
*/
