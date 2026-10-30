// 136. Single Number (Easy)
// https://leetcode.com/problems/single-number/
// Idea: XOR everything: pairs cancel out (a ^ a = 0), leaving the single number.

class Solution {
    public int singleNumber(int[] nums) {
        int x = 0;
        for (int n : nums) x ^= n;
        return x;
    }
}
