class Solution {
    public int uniquePaths(int m, int n) {
        if(m==1 || n==1)
            return 1;
        int [][] dp = new int[m+1][n+1];
        return calc(m,n,dp);
    }
    public static int calc(int m, int n, int [][] dp)
    {
        if(m==1 || n==1)
            return 1;
        if(dp[m][n]!=0)
            return dp[m][n];
        dp[m][n] = calc(m-1,n,dp)+calc(m,n-1,dp);
        return dp[m][n];
    }
}