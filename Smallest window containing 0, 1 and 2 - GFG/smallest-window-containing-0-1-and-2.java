// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            Solution ob = new Solution();
            int ans = ob.smallestSubstring(S);

            System.out.println(ans);
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {
    public int smallestSubstring(String S) {
        // Code here
        int [] arr = new int[3];
        arr[0]=arr[1]=arr[2]=-1;
        int ans=Integer.MAX_VALUE;
        boolean flag = false;
        for(int i=0;i<S.length();i++){
            switch(S.charAt(i)){
                case '0':arr[0]=i;break;
                case '1':arr[1]=i;break;
                case '2':arr[2]=i;break;
            }
            if(arr[0]!=-1 && arr[1]!=-1 && arr[2]!=-1)
            {
                flag =true;
                int min = Math.min(arr[0],Math.min(arr[1],arr[2]));
                int max = Math.max(arr[0],Math.max(arr[1],arr[2]));
                ans = Math.min(ans, max-min+1);
            }
        }
        if(flag)
            return ans;
        return -1;
    }
};
