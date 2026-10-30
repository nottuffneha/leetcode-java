// 101. Symmetric Tree (Easy)
// https://leetcode.com/problems/symmetric-tree/
// Idea: Check if the left subtree is a mirror of the right: outer children match and inner children match.

class Solution {
    public boolean isSymmetric(TreeNode root) {
        return mirror(root.left, root.right);
    }
    private boolean mirror(TreeNode a, TreeNode b) {
        if (a == null && b == null) return true;
        if (a == null || b == null || a.val != b.val) return false;
        return mirror(a.left, b.right) && mirror(a.right, b.left);
    }
}
