/*
https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
 */
public class BestTimeToBuyAndSellStock {

    /*
    Time complexity o(n)
    Space complexity o(1)
     */
    public int maxProfit(int[] prices) {
        int highest = prices[prices.length-1];
        int maxProfit = 0;
        for(int i=prices.length-2; i>=0; i--){
            if((highest - prices[i]) > maxProfit)
                maxProfit = highest - prices[i];
            highest = Math.max(highest,prices[i]);
        }
        return maxProfit;
    }
}
