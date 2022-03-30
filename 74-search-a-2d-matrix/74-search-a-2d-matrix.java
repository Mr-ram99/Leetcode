class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
         if(target>matrix[n-1][m-1])
             return false;
        int r=0;
        while(r<n && matrix[r][m-1]<target){
            r++;
        }
        int s=0, e=m-1;
        while(s<=e){
           int mid = s+(e-s)/2;
            if(matrix[r][mid]==target)
                {
                return true;
            }
            else if(matrix[r][mid]>target){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return false;
    }
}