class Solution {
    public boolean winnerSquareGame(int n) {
        if((int)(Math.sqrt(n))*(int)(Math.sqrt(n)) == n)
            return true;
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        int [] dp = new int[n+1];
        dp[1] = 1;
        int i;
        for(i=2;i<=n;i++)
        {
            if((int)Math.sqrt(i)*(int)Math.sqrt(i) == i)
                set.add(i);
            if(canAliceWin(i,dp,set))
                dp[i] = 1;
            else
                dp[i] = 2;
        }
        if(dp[n]==1)
            return true;
        return false;
    }
    public static boolean canAliceWin(int n, int[] dp, HashSet<Integer> set)
    {
        if((int)(Math.sqrt(n))*(int)(Math.sqrt(n)) == n)
            return true;
        int j=n;
        for(int k:set)
        {
            int index = n-k;
            if(index>0)
            {
                if(dp[index]==2)
                    return true;
            }
        }
        return false;
    }        
}