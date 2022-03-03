// { Driver Code Starts
//Initial Template for Java

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
            String str[] = read.readLine().trim().split("\\s+");
            int r = Integer.parseInt(str[0]);
            int c = Integer.parseInt(str[1]);
            int matrix[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                int k = 0;
                str = read.readLine().trim().split("\\s+");
                for(int j = 0; j < c; j++){
                  matrix[i][j] = Integer.parseInt(str[k]);
                  k++;
                }
            }
            Solution obj = new Solution();
            int[] p = obj.endPoints(matrix,r,c);
            System.out.print("(" +  p[0]+ ", " +  p[1]+ ")" +"\n");
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static int [] endPoints(int [][]arr, int m, int n){
        //code here
        int [][] dir = {{0,1},{1,0},{0,-1},{-1,0}};
        int d = 0; // 0-right, 1-down, 2-left, 3-up
        int i=0,j=0;
        while(i>=0 && i<m && j>=0 && j<n){
            if(arr[i][j]==0){
                i+=dir[d][0];
                j+=dir[d][1];
            }
            else{
                arr[i][j]=0;
                d = (d+1)%4;
            }
        }
        return new int[]{i-dir[d][0],j-dir[d][1]};
        
        
    }
}