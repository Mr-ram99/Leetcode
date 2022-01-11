class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int prev=0,prev2=0,cur=0;
        for(int i=2;i<=n;i++)
        {
            cur = Math.min(prev+cost[i-2] ,prev2+cost[i-1]);
            prev  = prev2;
            prev2 = cur;
        }
        return cur;
    }
}