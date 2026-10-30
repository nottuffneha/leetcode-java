// 100. Same Tree (Easy)
// https://leetcode.com/problems/same-tree/
// Idea: Two trees are the same if roots match and both left and right subtrees are the same (recursion).

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null || p.val != q.val) return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
