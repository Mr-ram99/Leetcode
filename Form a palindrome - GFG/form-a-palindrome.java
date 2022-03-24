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
            
            String S = read.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.findMinInsertions(S));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    int findMinInsertions(String S){
        // code here
        int n= S.length();
          int dp[][]= new int[n][n];
          for(int gap=0; gap<n;gap++){
                for(int i=0; i<n-gap; i++){
                    int  j=i+gap;
                if(i==j) dp[i][j]=0;
                else if (i+1==j)
                      {
                      if(S.charAt(i)==S.charAt(j)) 
                            dp[i][j]=0;
                       else  dp[i][j]=1;
                      }
                else if(S.charAt(i)==S.charAt(j))
                  dp[i][j]=dp[i+1][j-1];
          
                else{
                  dp[i][j]= Math.min(dp[i][j-1],dp[i+1][j])+1;
                    }
        }
    }
    return dp[0][n-1];
    }
}