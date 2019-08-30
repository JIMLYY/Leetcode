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
    public int closestValue(TreeNode root, double target) {
        int closest = root.val;
        while(root != null){
            closest  = Math.abs(root.val - target) < Math.abs(closest - target)? root.val : closest;
            if(root.val > target){
                root = root.left;
            }
            else{
                root = root.right;
            }
        }
        return closest;
    }
}
/*
Topic: Binary Search and Tree
Time: O(k) in average case and O(k + H) in worse case
k is the index of closet element
Space: O(H)
*/
