// { Driver Code Starts
// Initial Template for Java

import java.util.*;
class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<String> res = obj.findPath(a, n);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++)
                    System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}
// } Driver Code Ends


// User function Template for Java

// m is the given matrix and n is the order of matrix
class Solution {
    public static ArrayList<String> findPath(int[][] mat, int n) {
        // Your code here
        
        boolean [][] visited= new boolean[n][n];
        ArrayList<String> list = new ArrayList<>();
        if(mat[0][0]==0)
            return list;
        visited[0][0]=true;
        allways(mat,0,0,visited,"",list);
        return list;
       
    }
    public static void allways(int [][] mat, int i, int j, boolean [][] visited,String s, ArrayList<String> list){
        int n = mat.length;
        if(i==n-1 && j==n-1)
            {
                list.add(s);
                return ;
            }
            if(i+1<n && !visited[i+1][j] && mat[i+1][j]!=0){
                visited[i+1][j] = true;
                allways(mat,i+1,j,visited,s+'D',list);
                visited[i+1][j] = false;
            }
            if(i-1>=0 && !visited[i-1][j] && mat[i-1][j]!=0){
                visited[i-1][j] = true;
                allways(mat,i-1,j,visited,s+'U',list);
                visited[i-1][j] = false;
            }
            if(j+1<n && !visited[i][j+1] && mat[i][j+1]!=0){
                visited[i][j+1] = true;
                allways(mat,i,j+1,visited,s+'R',list);
                visited[i][j+1] = false;
            }
            if(j-1>=0 && !visited[i][j-1] && mat[i][j-1]!=0){
                visited[i][j-1] = true;
                allways(mat,i,j-1,visited,s+'L',list);
                visited[i][j-1] = false;
            }
            
    }
}