class Solution {
    public void rotate(int[][] matrix) {
        transpose(matrix);
        swapRow(matrix);
    }
    public static void transpose(int [][] mat)
    {
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<=i;j++)
            {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
    }
    public static void swapRow(int [][] mat)
    {
        int col = mat[0].length;
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length/2;j++)
            {
                int temp = mat[i][j];
                mat[i][j] = mat[i][col-j-1];
                mat[i][col-j-1] = temp;
            }
        }
    }
}