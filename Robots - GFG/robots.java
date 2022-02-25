// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


 // } Driver Code Ends
//User function Template for Java

class Solution{
    public static String moveRobots(String s1, String s2){
        //code here
        int n = s1.length(),cnt = 0;
       
       for(int i=0;i<n;i++){
           if((s1.charAt(i)=='A' && cnt!=0) || cnt<0){
               return "No";
           }
           if(s1.charAt(i)=='B'){
               cnt++;
           }
           if(s2.charAt(i)=='B'){
               cnt--;
           }
       }
       cnt = 0;
       for(int i=n-1;i>=0;i--){
           if((s1.charAt(i)=='B' && cnt!=0) || cnt<0){
               return "No";
           }
           if(s1.charAt(i)=='A'){
               cnt++;
           }
           if(s2.charAt(i)=='A'){
               cnt--;
           }
       }
       
       return "Yes";
    }
}


// { Driver Code Starts.

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String s1=read.readLine();
            String s2=read.readLine();

            Solution ob = new Solution();
            System.out.println(ob.moveRobots(s1, s2));
        }
    }
}  // } Driver Code Ends