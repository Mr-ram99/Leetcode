class Solution {
    public int climbStairs(int n) {
        int prev = 0;
        int prev2 = 1;
        int cur = 1;
        for(int i=1;i<=n;i++)
        {
            cur = prev + prev2;
            prev = prev2;
            prev2 = cur;
        }
        return cur;
    }
}