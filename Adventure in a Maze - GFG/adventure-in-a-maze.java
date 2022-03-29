// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int[][] matrix = new int[n][n];
            for(int i = 0; i < n; i++){
                String[] s = br.readLine().trim().split(" ");
                for(int j = 0; j < n; j++)
                    matrix[i][j] = Integer.parseInt(s[j]);
            }
            Solution obj = new Solution();
            int[] ans = obj.FindWays(matrix);
            for(int i = 0; i < ans.length; i++){
                System.out.print(ans[i] + " ");
            }
            System.out.println();

        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int[] FindWays(int[][] matrix)
    {
        // Code 
        int n = matrix.length;
        int [][] dp = new int[n][n];
        for(int [] a : dp){
            Arrays.fill(a,-1);
        }
        int ways = count(0,0,matrix,dp);
        for(int [] a : dp){
            Arrays.fill(a,-1);
        }
        int max = maxPath(0,0,matrix,dp);
        if(max<0)
            max = 0;
        return new int[]{ways,max};
    }
    public static int count(int i, int j, int [][] mat, int [][] dp){
        int n=mat.length;
        int mod = 1000000007;
        if(i==n-1 && j==n-1)
            return 1;
        if(i>n-1 || j>n-1)
            return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int a=0, b=0, c=0, d=0;
        if(mat[i][j]==1){
            a = count(i,j+1,mat,dp);
        }
       else if(mat[i][j]==2){
            b = count(i+1,j,mat,dp);
        }
        else{
            c = count(i+1,j,mat,dp);
            d = count(i,j+1,mat,dp);
        }
        return dp[i][j] = (a+b+c+d)%mod;   
    }
    public static int maxPath(int i, int j, int [][] mat, int [][] dp){
        int n=mat.length;
        int mod = 1000000007;
        if(i==n-1 && j==n-1){
              return mat[i][j];
        }
        if(i>n-1 || j>n-1)
            return Integer.MIN_VALUE;
        if(dp[i][j]!=-1) return dp[i][j];
        int a = Integer.MIN_VALUE, b=Integer.MIN_VALUE;
        if(mat[i][j]==1){
            a = 1 + maxPath(i,j+1,mat,dp);
        }
       else if(mat[i][j]==2){
            b = 2 + maxPath(i+1,j,mat,dp);
        }
        else{
            a = 3+ maxPath(i+1,j,mat,dp);
            b = 3+ maxPath(i,j+1,mat,dp);
        }
        return dp[i][j] = Math.max(a, b)%mod;
    }
}