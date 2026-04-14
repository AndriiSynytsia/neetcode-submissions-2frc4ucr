class Solution {
    public int maxProfit(int[] prices) {
        int buyDay = 0;
        int sellDay = 1;
        int maxProfit = 0;

        while(sellDay < prices.length) {
            if(prices[sellDay] > prices[buyDay]) {
                int profit = prices[sellDay] - prices[buyDay];
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyDay = sellDay;
            }
            sellDay++;
        }
        return maxProfit;
    }
}
