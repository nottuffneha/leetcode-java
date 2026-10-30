// 35. Search Insert Position (Easy)
// https://leetcode.com/problems/search-insert-position/
// Idea: Binary search; if the target isn't found, lo ends up exactly where it should be inserted.

class Solution {
    public int searchInsert(int[] nums, int target) {
        int lo = 0, hi = nums.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] == target) return mid;
            if (nums[mid] < target) lo = mid + 1;
            else hi = mid - 1;
        }
        return lo;
    }
}
