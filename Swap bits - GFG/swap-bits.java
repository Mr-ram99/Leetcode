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
            String input_line[] = read.readLine().trim().split("\\s+");
            int X = Integer.parseInt(input_line[0]);
            int P1 = Integer.parseInt(input_line[1]);
            int P2 = Integer.parseInt(input_line[2]);
            int N = Integer.parseInt(input_line[3]);
            
            Solution ob = new Solution();
            System.out.println(ob.swapBits(X, P1, P2, N));
        }
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution{
    
    int swapBits(int x, int p1, int p2, int n)
    {
        String bin=Integer.toBinaryString(x);
       for(int i=bin.length();i<=p2+n;i++)
           bin="0"+bin;
       int len=bin.length();
       String s1=bin.substring(len-(p1+n),len-p1);
       String s2=bin.substring(len-(p2+n),len-p2);
       String str=bin.substring(0,len-(p2+n))+s1+bin.substring(len-p2,len-(p1+n))+s2+bin.substring(len-p1);
       int count=0,ans=0;
       for(int i=str.length()-1;i>=0;i--){
           if(str.charAt(i)=='1')
               ans+=Math.pow(2,count);
           count++;
       }
       return ans;
   
    }
}