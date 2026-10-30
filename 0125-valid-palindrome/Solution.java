// 125. Valid Palindrome (Easy)
// https://leetcode.com/problems/valid-palindrome/
// Idea: Two pointers from both ends, skipping non-alphanumeric chars and comparing in lowercase.

class Solution {
    public boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            char a = s.charAt(i), b = s.charAt(j);
            if (!Character.isLetterOrDigit(a)) { i++; continue; }
            if (!Character.isLetterOrDigit(b)) { j--; continue; }
            if (Character.toLowerCase(a) != Character.toLowerCase(b)) return false;
            i++; j--;
        }
        return true;
    }
}
