// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.count(N));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    static int count(int N) 
    { 
        // code here
        // ------------- dp approach ---O(n2)
        if(N<=2)
            return N/2;
        // int [] dp = new int[N/2+1];
        // dp[0] = 1;
        // dp[1] = 1;
        // int sum=0;
        // for(int i=2;i<=N/2;i++)
        // {
        //     sum =0;
        //     for(int j=i-1;j>=0;j--)
        //     {
        //         sum += dp[j]*dp[i-j-1];
        //     }
        //     dp[i] = sum;
        // }
        // return dp[N/2];
        //  -----------------
        // ---------------------O(n) approach
        int n = N/2;
        long ans = binomial(2*n, n);
        return (int)(ans/(n+1));
    }
    public static long binomial(int m, int n)
    {
        long res = 1;
        for(int i=0;i<n;i++)
        {
           res *= (m-i);
           res /= (i+1);
        }  
        return res;
    }
};