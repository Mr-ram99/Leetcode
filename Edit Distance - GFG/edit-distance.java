// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String s1 = br.readLine();
            String[] S = s1.split(" ");
            String s = S[0];
            String t = S[1];
            Solution ob = new Solution();
            int ans = ob.editDistance(s, t);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


class Solution {
    public int editDistance(String s, String t) {
        // Code here
        int n = s.length()+1;
        int m = t.length()+1;
        int [][] dp = new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(i==0)
                    dp[i][j] = j;
                else if(j==0)
                    dp[i][j] = i;
            }
        }
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<m;j++)
            {
                if(s.charAt(i-1)!=t.charAt(j-1))
                dp[i][j] = 1+ Math.min(dp[i][j-1], Math.min(dp[i-1][j],dp[i-1][j-1]));
                else 
                dp[i][j] = dp[i-1][j-1];
            }
        }
        return dp[n-1][m-1];
    }
}