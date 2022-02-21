// { Driver Code Starts
import java.lang.*;
import java.io.*;
import java.util.*;
class GFG
 {
	public static void main (String[] args) throws IOException
	 {
	 
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        int t = Integer.parseInt(br.readLine()); 

        while(t-- > 0){
            int size = Integer.parseInt(br.readLine());
            String[] arrStr = ((String)br.readLine()).split("\\s+");
            int[] arr= new int[size];
            for(int i = 0;i<size;i++){
                arr[i] = Integer.parseInt(arrStr[i]);
            }
            System.out.println(new Solution().minJumps(arr));
        }
	 }
	 
}
// } Driver Code Ends


class Solution{
    static int minJumps(int[] arr){
        // your code here
        int curr_n=0;
        int N=0;
        int ans=0;
        int n = arr.length;
        for(int i=0;i<n-1;i++)
        {
            N=Math.max(N,i+arr[i]);
            if(curr_n==i)
            {
                ans++;
                curr_n=N;
            }
            if(arr[0]==0 && i==curr_n)
              return -1;
        }
        if(N<n-1)
         return -1;
        else
         return ans;
    }
}