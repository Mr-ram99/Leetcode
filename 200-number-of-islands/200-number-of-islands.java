class Solution {
    public int numIslands(char[][] grid) {
        int i,j,count=0;
        boolean [][] visited = new boolean[grid.length][grid[0].length];
        for(i=0;i<grid.length;i++){
            for(j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1' && !visited[i][j]){
                    count++;
                    visitIsland(grid,i,j,visited);
                }
            }
        }
        return count;
    }
    public static void visitIsland(char[][]grid, int i, int j, boolean [][] visited){
        if(grid[i][j]=='0')
            return ;
        int n=grid.length, m=grid[0].length;
        if(i+1<n && grid[i+1][j]=='1' && !visited[i+1][j])
        {
            visited[i+1][j] =true;
            visitIsland(grid,i+1,j,visited);
        }
        if(j+1<m && grid[i][j+1]=='1'&& !visited[i][j+1])
        {
            visited[i][j+1] =true;
            visitIsland(grid,i,j+1,visited);
        }
        if(i-1>=0 && grid[i-1][j]=='1' && !visited[i-1][j])
        {
            visited[i-1][j] =true;
            visitIsland(grid,i-1,j,visited);
        }
        if(j-1>=0 && grid[i][j-1]=='1' && !visited[i][j-1])
        {
            visited[i][j-1] =true;
            visitIsland(grid,i,j-1,visited);
        }
    }
    
}