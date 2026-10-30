// 13. Roman to Integer (Easy)
// https://leetcode.com/problems/roman-to-integer/
// Idea: Add each symbol's value, but subtract it when a bigger symbol comes right after it (like IV = 4).

class Solution {
    public int romanToInt(String s) {
        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            int cur = val(s.charAt(i));
            if (i + 1 < s.length() && cur < val(s.charAt(i + 1))) total -= cur;
            else total += cur;
        }
        return total;
    }
    private int val(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            default: return 1000;
        }
    }
}
