class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int maxProfit = 0;
        int currprice = 0;

        for (int i = 1; i < prices.length; i++) {
            buy = Math.min(buy,prices[i]);
            currprice = prices[i] - buy;
            maxProfit = Math.max(currprice,maxProfit);

        }
        return maxProfit;
    }
}