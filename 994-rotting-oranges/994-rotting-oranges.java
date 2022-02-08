class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q = new LinkedList<>();
        int [][] dir = {{-1,0},{0,-1},{1,0},{0,1}};
        int rows = grid.length;
        int cols = grid[0].length;
        int fresh = 0, count=0;
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(grid[i][j] == 2)
                    q.add(new int[]{i,j});
                else if(grid[i][j] == 1)
                    fresh++;
            }
        }
        if(fresh==0)
            return 0;
        while(!q.isEmpty())
        {
            count++;
            int size = q.size();
            for(int i=0;i<size;i++)
            {
                int [] rotten = q.remove();
                for(int [] d : dir)
                {
                    int x = rotten[0]+d[0];
                    int y = rotten[1]+d[1];
                    if(x>=0 && x<rows && y>=0 && y<cols)
                    {
                        if(grid[x][y]==1)
                        {
                            grid[x][y]=2;
                            q.add(new int[]{x,y});
                            fresh--;
                        }
                    }
                }
            }
        }
        if(fresh==0)
            return count-1;
        return -1;
    }
}