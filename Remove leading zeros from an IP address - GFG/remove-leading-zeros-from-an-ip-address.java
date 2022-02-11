// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Solution ob = new Solution();
                    System.out.println(ob.newIPAdd(s));
                }
        }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String newIPAdd(String S)
    {
        // your code here
        List<String> str = new ArrayList<>();
        int s=0;
        for(int i=0;i<S.length();i++)
        {
            if(S.charAt(i)=='.')
            {
                str.add(S.substring(s,i));
                s=i+1;
            }
        }
        str.add(S.substring(s));
        for(int i=0;i<str.size();i++)
        {
            int j=0;
            int n = str.get(i).length();
            while(j<n && str.get(i).charAt(j)=='0')
            j++;
            if(j==n)
                str.set(i,"0");
            else 
                str.set(i,str.get(i).substring(j));
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.size();i++)
        {
            if(i<str.size()-1)
                sb.append(str.get(i)+".");
            else 
                sb.append(str.get(i));
        }
        return sb.toString();
    }
}