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
    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return null;
        }
        TreeNode right = invertTree(root.right);
        TreeNode left = invertTree(root.left);
        root.left = right;
        root.right = left;
        return root;
    }
}
/*
Tpoic: Tree

Time: O(N) Each node is visited only once. so the time complexity
is O(N) where N is the number of nodes in the tree.
Space: O(H) where H is the height of the tree: Due to recursion, O(H) funtion
calls will be placed on the stack in the worst case.
*/
