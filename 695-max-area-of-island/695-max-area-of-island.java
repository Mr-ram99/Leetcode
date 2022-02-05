class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length; 
        boolean [][] visited = new boolean[n][m];
        int max=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==1 && !visited[i][j])
                {
                    max = Math.max(max,count(grid,i,j,visited));
                }
            }
        }
        return max;
    }
    public static int count(int[][] grid, int sr, int sc, boolean[][] visited)
    {
        int n = grid.length;;
        int m = grid[0].length;
        visited[sr][sc] = true;
        int count = 1;
        if(sr-1>=0 && grid[sr-1][sc]==1 && !visited[sr-1][sc])
        {
            count += count(grid,sr-1,sc, visited);
        }
        if(sr+1<n && grid[sr+1][sc]==1 && !visited[sr+1][sc])
        {
            count += count(grid,sr+1,sc, visited);
        }
        if(sc-1>=0 && grid[sr][sc-1]==1 && !visited[sr][sc-1])
        {
            count += count(grid,sr,sc-1, visited);
        }
        if(sc+1<m && grid[sr][sc+1]==1 && !visited[sr][sc+1])
        {
            count += count(grid,sr,sc+1, visited);
        }
        return count;
    }
}