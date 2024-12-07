class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int min = 0;
        for(int i = 0; i < prices.length; i++){
            maxProfit = Math.max(maxProfit, prices[i] - prices[min]);
            min = prices[i] < prices[min] ? i : min;
        }
        return maxProfit;
    }
}