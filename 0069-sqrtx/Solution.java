// 69. Sqrt(x) (Easy)
// https://leetcode.com/problems/sqrtx/
// Idea: Binary search on the answer using long to avoid overflow; hi ends on the largest number whose square is <= x.

class Solution {
    public int mySqrt(int x) {
        long lo = 0, hi = x;
        while (lo <= hi) {
            long mid = lo + (hi - lo) / 2;
            if (mid * mid <= x) lo = mid + 1;
            else hi = mid - 1;
        }
        return (int) hi;
    }
}
