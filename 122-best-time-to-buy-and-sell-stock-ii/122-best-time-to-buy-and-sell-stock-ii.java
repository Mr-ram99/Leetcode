class Solution {
    public int maxProfit(int[] prices) {
        int i,profit=0,n=prices.length;
        for(i=0;i<n-1;i++)
        {
            if(prices[i+1]>prices[i])
                profit += prices[i+1]-prices[i];
        }
        return profit;
    }
}