class Solution {
    public int maxProfit(int[] prices) {
        int buyDay = 0;
        int sellDay = 1;
        int maxProfit = 0;

        while(sellDay < prices.length) {
            if(prices[buyDay] < prices[sellDay]) {
                int profit = prices[sellDay] - prices[buyDay];
                maxProfit = Math.max(profit, maxProfit);
            } else {
                buyDay = sellDay;
            }
            sellDay++;
        }
        return maxProfit;
    }
}
