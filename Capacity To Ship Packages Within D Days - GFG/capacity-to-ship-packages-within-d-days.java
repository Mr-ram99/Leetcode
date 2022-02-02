// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            
            String S[] = read.readLine().split(" ");
            int[] arr = new int[N];
            
            int D = Integer.parseInt(read.readLine());
            
            for(int i=0; i<N; i++)
                arr[i] = Integer.parseInt(S[i]);

            Solution ob = new Solution();
            System.out.println(ob.leastWeightCapacity(arr,N,D));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    static int leastWeightCapacity(int[] arr, int N, int D) {
        // code here
       int i, s=0, total=0, ans=1;
       for(i=0;i<N;i++)
       {
           total += arr[i];
           if(arr[i]>s)
                s = arr[i];
       }
       if(D==1)
           return total;
       int e =total;
        while(s<=e)
        {
            int mid = s + (e-s)/2;
            
            if(check(arr, mid)>D)
                s = mid+1;
            else
                {
                    ans = mid;
                    e = mid-1;
                }
        }
        return ans;
    }
    public static int check(int [] arr, int w)
    {
        int n = arr.length;
        int i, sum=0, days=1;
        for(i=0;i<n;i++)
        {
            sum += arr[i];
            if(sum>w)
            {
                days++;
                sum=arr[i];
            }
        }
        return days;
    }
};