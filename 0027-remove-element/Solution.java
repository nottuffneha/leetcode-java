// 27. Remove Element (Easy)
// https://leetcode.com/problems/remove-element/
// Idea: Two pointers: copy every value that isn't val to the front; k is the new length.

class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int n : nums) {
            if (n != val) nums[k++] = n;
        }
        return k;
    }
}
