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
            int N = Integer.parseInt(read.readLine());
            String S = read.readLine();

            Solution ob = new Solution();
            System.out.println(ob.sevenSegments(S,N));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    static String sevenSegments(String S, int N) {
     // code here
       int totalSegments = 0;
       int[] segCounts = {6,2,5,5,4,5,6,3,7,5};
       for(int i=0;i<N;i++) {
           totalSegments += segCounts[S.charAt(i)-'0'];
       }
       
       StringBuilder sb = new StringBuilder("");
       for(int i=0;i<N;i++) {
               for(int j=0;j<10;j++){
                   int count = totalSegments-segCounts[j];
                   if( count >=2*(N-i-1) &&  count <= 7*(N-i-1)) {
                       sb.append(""+j);
                       totalSegments-=segCounts[j];
                       break;
                   }
               }
       }
       return sb.toString();
    }
};