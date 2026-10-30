// 121. Best Time to Buy and Sell Stock (Easy)
// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
// Idea: Track the lowest price so far and the best profit if you sold today.

class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE, best = 0;
        for (int p : prices) {
            minPrice = Math.min(minPrice, p);
            best = Math.max(best, p - minPrice);
        }
        return best;
    }
}
