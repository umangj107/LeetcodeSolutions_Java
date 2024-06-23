class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0, index = 0, n = prices.length;
        while(index < n-1){
            if(prices[index+1] > prices[index]){
                maxProfit = maxProfit + prices[index+1] - prices[index];
            }
            index++;
        }
        return maxProfit;
    }
}