class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        if(grid[0][0]==1 || grid[n-1][n-1]==1)
            return -1;
        if(n==1){
            if(grid[0][0]==0)
                return 1;
            return -1;
        }
        int [][] dir = {{0,1},{0,-1},{1,0},{-1,0},{1,-1},{-1,1},{-1,-1},{1,1}};
        Queue<int[]> q = new LinkedList<>();
        boolean [][] visited = new boolean[n][n];
        q.add(new int[]{0,0});
        int ans=1;
        visited[0][0]=true;
        while(!q.isEmpty()){
            int size = q.size();
            while(size-->0){
                int [] arr = q.remove();
                for(int [] d: dir){
                    int x = arr[0]+d[0];
                    int y = arr[1]+d[1];
                    if(isValid(x,y,n) && !visited[x][y] && grid[x][y]==0){
                        if(x==n-1 && y==n-1)
                            return ans+1;
                        q.offer(new int[]{x,y});
                        visited[x][y]=true;
                    }
                }
            }
            ans++;
        }
        return -1;
    }
    public static boolean isValid(int x, int y, int n){
        if(x>=0 && x<n && y>=0 && y<n)
            return true;
        return false;
    }
}