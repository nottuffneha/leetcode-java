// 112. Path Sum (Easy)
// https://leetcode.com/problems/path-sum/
// Idea: Subtract the node's value from the target as you go down; at a leaf check if what's left equals the leaf value.

class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;
        if (root.left == null && root.right == null) return root.val == targetSum;
        int rest = targetSum - root.val;
        return hasPathSum(root.left, rest) || hasPathSum(root.right, rest);
    }
}
