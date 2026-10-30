// 104. Maximum Depth of Binary Tree (Easy)
// https://leetcode.com/problems/maximum-depth-of-binary-tree/
// Idea: Depth = 1 + max(depth of left, depth of right); empty tree is 0.

class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
