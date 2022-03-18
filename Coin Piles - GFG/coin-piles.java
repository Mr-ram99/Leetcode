// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S1[] = read.readLine().split(" ");
            int N = Integer.parseInt(S1[0]);
            int K = Integer.parseInt(S1[1]);
            
            String S[] = read.readLine().split(" ");
            int[] A = new int[N];
            
            for(int i=0; i<N; i++)
                A[i] = Integer.parseInt(S[i]);

            Solution ob = new Solution();
            System.out.println(ob.minSteps(A,N,K));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    static int minSteps(int[] A, int N, int K) {
        // code here
        Arrays.sort(A);
        int [] prefix = new int[N];
        prefix[0] = A[0];
        int ans=Integer.MAX_VALUE;
        for(int i=1;i<N;i++){
            prefix[i] = prefix[i-1]+A[i];
        }
        for(int i=0;i<N;i++){
            int ub = upperBound(A, A[i]+K);
            int ra = ub==-1 ? 0: (prefix[N-1]-prefix[ub-1]) - (A[i]+K)*(N-ub);
            int la = i==0 ?0:prefix[i-1];
            ans = Math.min(ans, la+ra);
        }
        return ans;
    }
    public static int upperBound(int [] arr, int key){
        int mid, n = arr.length;
        int low=0;
        int high=n;
        while(low<high && low!=n){
            mid = low +(high-low)/2;
            if(key>=arr[mid])
                low = mid+1;
            else
                high = mid;
        }
        if(low==n)return -1;
        return low;
    }
};










