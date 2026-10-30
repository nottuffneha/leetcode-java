// 70. Climbing Stairs (Easy)
// https://leetcode.com/problems/climbing-stairs/
// Idea: Ways(n) = Ways(n-1) + Ways(n-2), basically Fibonacci, kept in two variables.

class Solution {
    public int climbStairs(int n) {
        int a = 1, b = 1;
        for (int i = 2; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}
