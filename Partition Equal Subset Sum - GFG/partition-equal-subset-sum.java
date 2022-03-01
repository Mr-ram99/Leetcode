// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String input_line[] = in.readLine().trim().split("\\s+");
            int arr[] = new int[N];
            for(int i = 0;i < N;i++)
                arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            int x = ob.equalPartition(N, arr);
            if(x == 1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution{
    static int equalPartition(int N, int arr[])
    {
        // code here
        int sum=0;
        for(int num:arr){
            sum+=num;
        }
        if(sum%2!=0)
            return 0;
        else{
            int req = sum/2;
            int [][] dp = new int[N][req+1];
            for(int[] n:dp){
                Arrays.fill(n,-1);
            }
            return solve(dp,arr,0,req);
        }
    }
    static int solve(int [][] dp, int [] arr, int ind, int k){
        if(k==0){
            return 1;
        }
        if(ind==arr.length)
            return 0;
        if(dp[ind][k]!=-1)
            return dp[ind][k];
        int p = solve(dp,arr,ind+1,k);
        int q = 0;
        if(arr[ind]<=k)
            q = solve(dp,arr,ind+1,k-arr[ind]);
        return dp[ind][k] = Math.max(p,q);
            
    }
}