// 66. Plus One (Easy)
// https://leetcode.com/problems/plus-one/
// Idea: Go from the last digit: if it's < 9 just add 1 and return; if it's 9 make it 0 and carry. All 9s means a new array starting with 1.

class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) { digits[i]++; return digits; }
            digits[i] = 0;
        }
        int[] res = new int[digits.length + 1];
        res[0] = 1;
        return res;
    }
}
