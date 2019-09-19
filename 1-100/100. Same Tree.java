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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        else if(p == null || q == null) return false;
        else{
            return p.val == q.val && isSameTree(p.left, q.left) &&isSameTree(p.right, q.right);
        }
    }
}

/*
Topic: Tree
Time: O(N)
Space: O(log(n)) is the best case of a completely balanced tree and O(N) is the
worst case of completely unbalanced tree, to keep a recursion stack.
*/
