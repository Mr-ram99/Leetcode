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
            String str = br.readLine().trim();
            Solution obj = new Solution();
            long ans = obj.findRank(str);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public long findRank(String S)
    {
        // Code here
        int n=S.length();
        int [] arr = new int[26];
        for(int i=0;i<n;i++){
            arr[S.charAt(i)-'a']++;
        }
        long sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<S.charAt(i)-'a';j++){
                if(arr[j]>0){
                    int g = n-i-1;
                    sum += fact(g);
                }
            }
            arr[S.charAt(i)-'a']--;
        }
        return sum+1;
    }
    public static long fact(int n){
        if(n<=0)
            return 1;
        long ans = n;
        while(n-->1){
            ans *= n;
        }
        return ans;
    }
}