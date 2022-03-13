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
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int k = Integer.parseInt(s[2]);
            int[][] blocked_cells = new int[k][2];
            for(int i = 0; i < k; i++){
                String[] s1 = br.readLine().trim().split(" ");
                for(int j = 0; j < 2; j++){
                    blocked_cells[i][j] = Integer.parseInt(s1[j]);
                }
            }
            Solution obj = new Solution();
            int ans = obj.FindWays(n, m, blocked_cells);
            System.out.println(ans);

        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int mod=1000000007;
    public int FindWays(int n, int m, int[][] blocked_cells)
    {
        // Code here
        int [][] mat = new int[n][m];
        int [][] dp = new int[1000][1000];
        for(int [] arr:dp){
            Arrays.fill(arr,-1);
        }
        for(int i=0;i<blocked_cells.length;i++){
            int x = blocked_cells[i][0]-1;
            int y = blocked_cells[i][1]-1;
            mat[x][y]=-1;
        }
        
        if(mat[n-1][m-1]==-1 || mat[0][0]==-1)
            return 0;
        return count(mat,0,0,dp);
        
    }
    public static int count(int [][] mat, int i, int j, int[][] dp){
        int n=mat.length, m=mat[0].length;
        if(i==n-1 && j==m-1)
            return 1;
        if(dp[i][j]!=-1)
            return dp[i][j];
        int r=0, d=0;
        if(i<n-1 && mat[i+1][j]!=-1)
            {
                r += count(mat,i+1,j,dp);
                dp[i+1][j]=r;
            }
        if(j<m-1 && mat[i][j+1]!=-1)
            {
                d += count(mat,i,j+1,dp);
                dp[i][j+1]=d;
            }
        dp[i][j]=(r%mod+d%mod)%mod;
        return dp[i][j];
    }
}