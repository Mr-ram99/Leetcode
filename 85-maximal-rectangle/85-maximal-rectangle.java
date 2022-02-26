// class Solution {
//     public int maximalRectangle(char[][] matrix) {
//         int rows= matrix.length;
//         int cols = matrix[0].length;
//         int [][] mat = new int[rows][cols];
// //         convert char to int
//         for(int i=0;i<rows;i++){
//             for(int j=0;j<cols;j++){
//                 if(matrix[i][j]=='1'){
//                     mat[i][j]=1;
//                 }
//                 else{
//                     mat[i][j]=0;
//                 }
//             }
//         }
// //         converting each row to largest rectangle area problem
//         for(int i=1;i<rows;i++){
//             for(int j=0;j<cols;j++){
//                 if(mat[i][j]==1){
//                     mat[i][j]=1+mat[i-1][j];
//                 }
//             }
//         }
// //         solving for each row
//         int max=0;
//         for(int [] a: mat){
//             max = Math.max(max, maxArea(a));
//         }
//         return max;
//     }
//     public static int maxArea(int [] arr){
//         int cols = arr.length;
//         Stack<Integer> stk = new Stack<>();
//         int [] left = new int[cols];
//         int [] right = new int[cols];
//         int max=0;
//         for(int i=0;i<cols;i++){
//             while(!stk.isEmpty() && arr[stk.peek()]>=arr[i])
//                 stk.pop();
//             if(stk.isEmpty()) left[i]=-1;
//             else left[i]=stk.peek();
//             stk.add(i);
//         }
//         stk.clear();
//         for(int i=cols-1;i>=0;i--){
//             while(!stk.isEmpty() && arr[stk.peek()]>=arr[i])
//                 stk.pop();
//             if(stk.isEmpty()) right[i]=cols;
//             else right[i]=stk.peek();
//             stk.add(i);
//         }
//         for(int i=0;i<cols;i++){
//             if((right[i]-left[i]-1)*arr[i]>max)
//                 max = (right[i]-left[i]-1)*arr[i];
//         }
//         return max;
//     }
// }
class Solution {
  public int maximalRectangle(char[][] matrix) {
    if (matrix.length <= 0) return 0;
    int n = matrix.length;
    int m = matrix[0].length;
    int[][] dp = new int[n][m];
    int maxArea = 0;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if (i == 0)
		  dp[i][j] = matrix[i][j] == '1' ? 1 : 0;
        else
		  dp[i][j] = matrix[i][j] == '1' ? (dp[i-1][j] + 1) : 0;
        int min = dp[i][j];
        for (int k = j; k >= 0; k--) {
          if (min == 0) break;
          if (dp[i][k] < min) min = dp[i][k];
          maxArea = Math.max(maxArea, min * (j - k + 1));
        }
      }
    }
    return maxArea;
  }
}