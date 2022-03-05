class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n= isConnected.length;
        boolean [] visited = new boolean[n];
        int count=0;
        for(int i=0;i<n;i++){
            if(!visited[i])
            {
                count++;
                visited[i]  = true;
                dfs(isConnected,i,visited);
            }
        }
        return count;
    }
    public static void dfs(int [][] c, int i, boolean [] visited){
        for(int j=0;j<c[0].length;j++){
            if(!visited[j] && c[i][j]==1)
            {
                visited[j]=true;
                dfs(c,j,visited);
            }
        }
    }
}