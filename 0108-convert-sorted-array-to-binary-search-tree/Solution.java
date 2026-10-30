// 108. Convert Sorted Array to Binary Search Tree (Easy)
// https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
// Idea: Pick the middle element as root, build the left half and right half recursively, which keeps it balanced.

class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return build(nums, 0, nums.length - 1);
    }
    private TreeNode build(int[] nums, int lo, int hi) {
        if (lo > hi) return null;
        int mid = lo + (hi - lo) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = build(nums, lo, mid - 1);
        node.right = build(nums, mid + 1, hi);
        return node;
    }
}
