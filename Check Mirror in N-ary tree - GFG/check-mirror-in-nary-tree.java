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
            String S[] = read.readLine().split(" ");
            
            int n = Integer.parseInt(S[0]);
            int e = Integer.parseInt(S[1]);
            
            String S1[] = read.readLine().split(" ");
            String S2[] = read.readLine().split(" ");
            
            int[] A = new int[2*e];
            int[] B = new int[2*e];
            
            for(int i=0; i<2*e; i++)
            {
                A[i] = Integer.parseInt(S1[i]);
                B[i] = Integer.parseInt(S2[i]);
            }

            Solution ob = new Solution();
            System.out.println(ob.checkMirrorTree(n,e,A,B));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    static int checkMirrorTree(int n, int e, int[] a, int[] b) {
        // code here
        HashMap<Integer, ArrayList<Integer>> map1 = new HashMap<>();
        HashMap<Integer, ArrayList<Integer>> map2 = new HashMap<>();
        for(int i=0;i<e*2;i+=2){
            if(!map1.containsKey(a[i])){
                map1.put(a[i],new ArrayList<Integer>());
            }
            map1.get(a[i]).add(a[i+1]);
            if(!map2.containsKey(b[i])){
                map2.put(b[i],new ArrayList<Integer>());
            }
            map2.get(b[i]).add(b[i+1]);
        }
        for(Map.Entry<Integer,ArrayList<Integer>> entry: map1.entrySet()){
            int x = entry.getKey();
            ArrayList<Integer> li1 = entry.getValue();
            ArrayList<Integer> li2 = map2.get(x);
            for(int i=0;i<li1.size();i++){
                if(li1.get(i)!=li2.get(li1.size()-i-1))
                    return 0;
            }
        }
        return 1;
    }
};