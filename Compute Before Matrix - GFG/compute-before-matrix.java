// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" "); 
            int N = Integer.parseInt(S[0]);
            int M = Integer.parseInt(S[1]);
            
            int[][] mat = new int[N][M];
            for(int i=0; i<N; i++)
            {
                String St[] = read.readLine().split(" "); 
                for(int j=0; j<M; j++)
                {
                    mat[i][j] = Integer.parseInt(St[j]);
                }
            }
            
            Solution ob = new Solution();
            int[][] before = ob.computeBeforeMatrix(N,M,mat);
            for(int i=0; i<N;i++){
                for(int j = 0; j<M;j++){
                    out.print(before[i][j]);
                    out.print(' ');
                    
                }
                out.println();
            }
        }
        out.flush();
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    public int[][] computeBeforeMatrix(int N, int M,int[][] after ){
        // Code here
        int [][] mat = new int[N][M];
        int [][] res = new int[N][M];
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(i==0)
                {
                   mat[i][j]=0; 
                }
                else{
                    mat[i][j]=after[i][j]-after[i-1][j];
                }
            }
        }
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(i==0){
                    if(j==0)
                    res[i][j] = after[i][j];
                    else
                    res[i][j] = after[i][j] - after[i][j-1];
                }
                else
                {
                    if(j==0)
                    res[i][j] = mat[i][j];
                    else
                    res[i][j] = mat[i][j]-mat[i][j-1];
                }
            }
        }
        return res;
    }
}