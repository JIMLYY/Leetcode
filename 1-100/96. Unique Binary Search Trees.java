class Solution {
    public int numTrees(int n) {
        if(n < 1) return 0;
        int[] nums = new int[n + 1];
        nums[0] = 1;
        nums[1] = 1;
        for(int i = 2; i <=n; i++){
            for(int j = 0; j < i; j++){
                nums[i] += (nums[i - j - 1] * nums[j]);
            }
        }
        return nums[n];
    }
}

/*
Topic: dynamic programming
Method: Image that we are given a sorted sequnece  1..n
to construct a Binary Search Tree(BST) out of the sequence,
we could enumerate each number i in the sequence, and use the
number as the root. Then, the subsequence 0...(i-1) could be number of
nodes in left branch. The number of nodes in the right branch should be
i-1...0 since the total number should be n. As we can see, the problem can be
reduced into similar probelm with smaller size. In the solution above, we sore the
solution of subproblems for further use. 
Time complexity: O(n^2)
Space complexity: O(n)
*/
