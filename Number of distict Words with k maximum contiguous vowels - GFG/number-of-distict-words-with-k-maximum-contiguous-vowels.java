// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N = sc.nextInt();
            int K = sc.nextInt();

            Solution ob = new Solution();
            int ans = ob.kvowelwords(N,K);
            System.out.println(ans);
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    public int kvowelwords(int N,int K){
        // code here
        long [][] dp = new long[N+1][K+1];
        for(long [] a:dp){
            Arrays.fill(a,-1);
        }
        return (int)(calc(N,K,K,dp)%1000000007);
    }
    public static long calc(int n, int k, int rem, long [][] dp){
        if(n==0){
            return 1;
        }
        long choice1=0, choice2=0, mod = 1000000007;
        if(dp[n][rem]!=-1)
        return dp[n][rem]%mod;
        
        if(rem>0){
            choice1 = (5*calc(n-1,k,rem-1,dp)%mod)%mod;
        }
        choice2 = (21*calc(n-1,k,k,dp)%mod)%mod;
        return dp[n][rem] = (choice1%mod+choice2%mod)%mod;
    }
}
