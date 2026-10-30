// 94. Binary Tree Inorder Traversal (Easy)
// https://leetcode.com/problems/binary-tree-inorder-traversal/
// Idea: Recursion: left subtree, then the node, then right subtree.

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        go(root, res);
        return res;
    }
    private void go(TreeNode node, List<Integer> res) {
        if (node == null) return;
        go(node.left, res);
        res.add(node.val);
        go(node.right, res);
    }
}
