class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int low = prices[0];
        for(int i = 1; i < prices.length; i++) {
            if(prices[i] - low > maxProfit) {
                maxProfit = prices[i] - low; 
            } else if(low > prices[i]) {
                low = prices[i];
            }
        }
        return maxProfit;
    }
}
