// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.next());
		while(t-- > 0)
		{
		    int n = Integer.parseInt(sc.next());
		    int a[][] = new int[n][n];
		    
		    for(int i=0;i<n;i++)
		    {
		        for(int j=0;j<n;j++)
		        {
		            a[i][j] = Integer.parseInt(sc.next());
		        }
		    }
		    
		    int k = Integer.parseInt(sc.next());
		    Solution T = new Solution();
		    System.out.println(T.Maximum_Sum(a,n,k));
		}
	}
}// } Driver Code Ends


class Solution
{
    public int Maximum_Sum(int mat[][],int N,int K){
        // Your code goes here
        int [][] rowsum = new int [N][N-K+1];
        int i, j, sum=0, max=Integer.MIN_VALUE;
        for(i=0;i<N;i++)
        {
            for(j=0;j<N;j++)
            {
                if(j==0)
                    sum=mat[i][j];
                else if(j<K-1)
                    sum+=mat[i][j];
                else
                {
                    if(j-K>=0)
                        sum-=mat[i][j-K];
                    sum+=mat[i][j];
                    rowsum[i][j-K+1]=sum;
                }
            }
        }
        for(i=0;i<=N-K;i++)
        {
            for(j=0;j<N;j++)
            {
                if(j==0)
                    sum=rowsum[j][i];
                else if(j<K-1)
                    sum+=rowsum[j][i];
                else
                {
                    if(j-K>=0)
                        sum-=rowsum[j-K][i];
                    sum+=rowsum[j][i];
                    if(sum>max)
                        max = sum;
                }
            }
        }
        return max;
    }
}
