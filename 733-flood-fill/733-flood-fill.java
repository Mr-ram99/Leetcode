class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        boolean [][] visited = new boolean[image.length][image[0].length];
        fill(image,sr,sc,newColor,visited,image[sr][sc]);
        return image;
    }
    public static void fill(int[][] image, int sr, int sc, int newColor, boolean[][] visited, int color)
    {
        int n = image.length;;
        int m = image[0].length;
        image[sr][sc] = newColor;
        visited[sr][sc] = true;
        if(sr-1>=0 && image[sr-1][sc]==color && !visited[sr-1][sc])
        {
            fill(image,sr-1,sc,newColor, visited, color);
        }
        if(sr+1<n && image[sr+1][sc]==color && !visited[sr+1][sc])
        {
            fill(image,sr+1,sc,newColor, visited, color);
        }
        if(sc-1>=0 && image[sr][sc-1]==color && !visited[sr][sc-1])
        {
            fill(image,sr,sc-1,newColor, visited, color);
        }
        if(sc+1<m && image[sr][sc+1]==color && !visited[sr][sc+1])
        {
            fill(image,sr,sc+1,newColor, visited, color);
        }
    }
}