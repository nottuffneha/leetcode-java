// 110. Balanced Binary Tree (Easy)
// https://leetcode.com/problems/balanced-binary-tree/
// Idea: Compute heights bottom-up and return -1 as soon as any node's subtrees differ by more than 1.

class Solution {
    public boolean isBalanced(TreeNode root) {
        return height(root) != -1;
    }
    private int height(TreeNode node) {
        if (node == null) return 0;
        int l = height(node.left);
        if (l == -1) return -1;
        int r = height(node.right);
        if (r == -1) return -1;
        if (Math.abs(l - r) > 1) return -1;
        return 1 + Math.max(l, r);
    }
}
