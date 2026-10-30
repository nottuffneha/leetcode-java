// 111. Minimum Depth of Binary Tree (Easy)
// https://leetcode.com/problems/minimum-depth-of-binary-tree/
// Idea: Like max depth but take the min; careful: if one child is missing, you must go down the other one.

class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null) return 1 + minDepth(root.right);
        if (root.right == null) return 1 + minDepth(root.left);
        return 1 + Math.min(minDepth(root.left), minDepth(root.right));
    }
}
