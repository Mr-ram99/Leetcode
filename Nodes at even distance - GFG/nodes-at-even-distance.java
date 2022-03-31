// { Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG{
	public static void main(String [] args) throws IOException{
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

            for(int i = 0; i <= n; i++) {
            	graph.add(new ArrayList<>());
            }
            
            int temp = n;
            while(temp-- > 1){
                int u = sc.nextInt();
                int v = sc.nextInt();
                graph.get(u).add(v);
                graph.get(v).add(u);
            }
            Solution ob = new Solution();
            System.out.println(ob.countOfNodes(graph, n));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    int countOfNodes(ArrayList<ArrayList<Integer>> graph, int n) 
    {
        // Write your code here
        boolean [] visited = new boolean[n+1];
        int [] count = new int[1];
        dfs(graph, visited, count, 1, 0);
        int m=count[0];
        return m*(m-1)/2 + (n-m)*(n-m-1)/2;
    }
    public static void dfs(ArrayList<ArrayList<Integer>> graph,boolean[] visited, int[] count, int node, int d){
        visited[node] = true;
        if(d%2==0) count[0]++;
        ArrayList<Integer> ch = graph.get(node);
        for(Integer c : ch){
            if(!visited[c]){
                dfs(graph, visited, count, c, d+1);
            }
        }
    }
}