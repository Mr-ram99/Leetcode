// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0){
            String input_line[] = read.readLine().trim().split("\\s+");
            int n1 = Integer.parseInt(input_line[0]);
            int n2 = Integer.parseInt(input_line[1]);
            int n3 = Integer.parseInt(input_line[2]);
            input_line = read.readLine().trim().split("\\s+");
            String A = input_line[0];
            String B = input_line[1];
            String C = input_line[2];
            Solution obj = new Solution();
            System.out.println(obj.LCSof3(A, B, C, n1, n2, n3));
        }
    } 
} // } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    int LCSof3(String A, String B, String C, int n1, int n2, int n3) 
    { 
        // code here
        return lcs(A,B,C,n1,n2,n3);
    }
    int lcs(String a, String b, String c, int n1, int n2, int n3){
        int [][][] dp = new int[n1+1][n2+1][n3+1];
        for(int i=n1;i>=0;i--){
            for(int j=n2;j>=0;j--){
                for(int k=n3;k>=0;k--){
                    if(i==n1 || j==n2 || k==n3){
                    dp[i][j][k]=0;
                }
                else{
                    if(a.charAt(i)==b.charAt(j) && b.charAt(j)==c.charAt(k)){
                        dp[i][j][k] = dp[i+1][j+1][k+1]+1;
                    }
                    else{
                        dp[i][j][k] = Math.max(dp[i][j+1][k], Math.max(dp[i+1][j][k], dp[i][j][k+1]));
                    }
                }
                }
            }
        }
        return dp[0][0][0];
    }
} 