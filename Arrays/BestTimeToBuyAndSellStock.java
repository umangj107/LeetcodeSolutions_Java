class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int buyPrice = Integer.MAX_VALUE, maxProfit = 0;
        for(int i = 0; i<n; i++){
            maxProfit = Math.max(maxProfit, prices[i]-buyPrice);
            buyPrice = Math.min(buyPrice, prices[i]);
        }
        return maxProfit;
        
    }
}