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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<String>();
        if(root != null)  dfs(root, res, "");
        return res;
    }

    public void dfs(TreeNode root, List<String> res, String path){
        if(root.left == null && root.right == null) res.add(path + root.val);
        if(root.left != null) dfs(root.left, res, path + root.val + "->");
        if(root.right != null) dfs(root.right, res, path + root.val + "->");
    }
}
/*
Topic: Tree & Depth-first search
Algorithms:
1. At each step, consider the node itself and its children
2. If the node  is not a leaf, we add the node.val to current path
3. call recursively the paty construction for it children
4. If node is a leaf, we add the path to result
Time: O(N) we visit each node exactly once. Therefore, the time complexity is O(N)
Space:  O(N) (space of stack call + space of storing the answer)
In the worse case where the tree is totally unbalanced, the space for stack call would
be O(N). The space for res is not going to be larger than O(logN).
*/
