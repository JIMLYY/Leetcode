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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        if(root == null) return result;
        LinkedList<TreeNode> list = new LinkedList<TreeNode>();
        boolean leftToRight = true;
        list.add(root);
        while(!list.isEmpty()){
            int size  = list.size();
            LinkedList<Integer> clist = new LinkedList<Integer>();
            if(leftToRight){
                for(int i = 0; i < size; i++){
                    TreeNode curr = list.remove(0);
                    clist.add(curr.val);
                    if(curr.left != null) list.add(curr.left);
                    if(curr.right != null) list.add(curr.right);
                }
            }else{
                for(int i = 0; i < size; i++){
                    TreeNode curr = list.remove(list.size() - 1);
                    clist.add(curr.val);
                    if(curr.right != null) list.add(0, curr.right);
                    if(curr.left != null) list.add(0, curr.left);
                }
            }
            result.add(clist);
            leftToRight =! leftToRight;
        }
        return result;
    }
}

/*
Topic: Array Tree BFS
Method: similar to 102. Binary Tree Level Order Traversal. In this question, we need to use boolean leftToRight to record
if the direction of traversal. Also be careful with the details, when traverse from left to right, curr = list.remove(0), and we add curr.left and curr.right. If we traverse from right to left, curr = list.remove(list.size() - 1), and we add its child nodes in front of list. right node first, left node second.
TC: O(N)
SC: O(N)
*/
