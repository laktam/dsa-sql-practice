class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = prices[0];
        for(int day = 0; day < prices.length; day++){
            if(prices[day] < minPrice) minPrice = prices[day];
            if(maxProfit < prices[day] - minPrice){
                maxProfit = prices[day] - minPrice;
            }
        }
        return maxProfit;
    }
}