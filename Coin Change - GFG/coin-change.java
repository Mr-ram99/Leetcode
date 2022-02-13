// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int Arr[] = new int[m];
            for (int i = 0; i < m; i++) Arr[i] = sc.nextInt();
            Solution ob = new Solution();
            System.out.println(ob.count(Arr, m, n));
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {
    public long count(int s[], int m, int n) {
        // code here.
        long [] dp = new long[n+1];
        dp[0]=1;
        for(int i=0;i<m;i++){
            for(int j=1;j<=n;j++){
                if(j-s[i]>=0)
                    dp[j] += dp[j-s[i]];
            }
        }
        return dp[n];
    }
}