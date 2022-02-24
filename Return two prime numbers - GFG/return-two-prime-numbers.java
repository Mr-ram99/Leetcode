// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            List<Integer> ans = new ArrayList<Integer>();
            ans = ob.primeDivision(N);
            System.out.println(ans.get(0) + " " + ans.get(1));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    static List<Integer> primeDivision(int N){
        // code here
        boolean [] primes = new boolean[N];//true->not prime,false->prime
        primes[0] = true;
        primes[1] = true;
        for(int i=2;i*i<=N;i++){
            if(primes[i]==false){
                for(int j=i*2;j<N;j+=i){
                    primes[j]=true;
                }
            }
        }
        List<Integer> primeNo = new ArrayList<>();
        for(int i=0;i<N;i++){
            if(!primes[i]){
                primeNo.add(i);
            }
        }
        int n = primeNo.size();
        for(int i=0,j=n-1;i<=j;){
            int first = primeNo.get(i);
            int second = primeNo.get(j);
            if(first+second==N){
                return new ArrayList<>(Arrays.asList(first,second));
            }
            else if(first+second<N)
                    i++;
            else
                    j--;
        }
        return new ArrayList<>(Arrays.asList(-1,-1));
    }
}