class Solution {
    public int[][] generateMatrix(int n) {
        int [][] arr = new int[n][n];
        int i, j, rowStart = 0, rowEnd = n-1, colStart = 0, colEnd = n-1;
        int dir = 1; // direction 1-right, 2-down, 3-left, 4-up
        int val = 1;
        while(rowStart<=rowEnd && colStart<=colEnd)
        {
            switch(dir)
            {
                case 1: for(i=colStart;i<=colEnd;i++){
                                arr[rowStart][i] = val++;
                        }
                        rowStart++; dir=2; break;
                case 2:for(i=rowStart;i<=rowEnd;i++){
                                arr[i][colEnd] = val++;
                        }
                        colEnd--; dir=3; break;
                case 3:for(i=colEnd;i>=colStart;i--){
                                arr[rowEnd][i] = val++;
                        }
                        rowEnd--; dir=4; break;
                case 4:for(i=rowEnd;i>=rowStart;i--){
                                arr[i][colStart] = val++;
                        }
                        colStart++; dir=1; break;
            }
        }
        return arr;
    }
}