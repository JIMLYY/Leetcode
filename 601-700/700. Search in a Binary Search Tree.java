/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

 // Recursion
class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null) return root;
        if(root.val == val){
            return root;
        }else{
            return val < root.val? searchBST(root.left, val) : searchBST(root.right, val);
        }
    }
}

// iteration

class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        while(root != null && root.val != val){
            root = root.val > val? root.left : root.right;
        }
        return root;
    }
}

/*
Topic: Tree
Time: O(N)
Space: O(1)
*/
