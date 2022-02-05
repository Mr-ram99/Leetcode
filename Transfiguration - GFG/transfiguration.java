// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])throws IOException
        {
            BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while(t-->0)
                {
                    String arr[] = br.readLine().split(" ");
                    String A = arr[0];
                    String B = arr[1];
                    Solution obj = new Solution();
                    System.out.println(obj.transfigure (A, B));
                }
        }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    int transfigure (String A, String B)
    {
    	// Your code goes here.
    	int n = A.length();
    	int sum =0, count=0;
    	if(n!=B.length())
    	    return -1;
    	for(int i=0;i<n;i++)
    	{
    	    sum += A.charAt(i);
    	    sum -= B.charAt(i);
    	}
    	if(sum!=0)
    	    return -1;
    int i=A.length()-1;
    int j=B.length()-1;
    while(i>=0 && j>=0)
    {
        if(A.charAt(i)==B.charAt(j))
        {
            i--;
            j--;
        }
        else
        {
            i--;
            count++;
        }
    }
    return count;
    	
    }
}