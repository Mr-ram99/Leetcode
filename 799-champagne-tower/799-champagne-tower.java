class Solution {
    public double champagneTower(int poured, int query_row, int query_glass) {
        int r = query_row;
        float [][] dp = new float[r+1][r+1];
        dp[0][0]=(float)poured;
        for(int i=1;i<=r;i++){
            for(int j=0;j<=i;j++){
                if(j==0){
                    if(dp[i-1][j]>1)
                        dp[i][j] += (dp[i-1][j]-1)/2.0;
                }
                else if(j==i){
                    if(dp[i-1][j-1]>1)
                        dp[i][j] += (dp[i-1][j-1]-1)/2.0;
                }
                else{
                    if(dp[i-1][j-1]>1)
                        dp[i][j] += (dp[i-1][j-1]-1)/2.0; 
                    if(dp[i-1][j]>1)
                        dp[i][j] += (dp[i-1][j]-1)/2.0; 
                }
                System.out.print(dp[i][j]+"  ");
            }
            System.out.println();
        }
        if(dp[query_row][query_glass]>1.0)
            return 1.0;
        return dp[query_row][query_glass];
    }
}