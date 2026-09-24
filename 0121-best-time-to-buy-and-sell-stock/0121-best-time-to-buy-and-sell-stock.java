class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxprofit = 0;
        int buy = prices[0];
        for(int i = 0;i<n;i++){
            buy = Math.min(prices[i],buy);
            int profit = prices[i] - buy;
            maxprofit = Math.max(profit,maxprofit);
        }
        return maxprofit;
    }
}