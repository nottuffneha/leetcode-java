// 9. Palindrome Number (Easy)
// https://leetcode.com/problems/palindrome-number/
// Idea: Reverse only the second half of the digits and compare it with the first half; negatives and numbers ending in 0 (except 0) are never palindromes.

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;
        int rev = 0;
        while (x > rev) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }
        return x == rev || x == rev / 10;
    }
}
