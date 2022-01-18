class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int n = prices.length;
        int i, ans=0;
        for(i=1;i<n;i++)
        {
            ans = Math.max(ans,prices[i]-min);
            min = Math.min(min,prices[i]);
        }
        return ans;
    }
}