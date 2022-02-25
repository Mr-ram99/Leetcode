class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int r=0;
        while(r<rows && matrix[r][cols-1]<target){
            r++;
        }
        if(r==rows)
            return false;
        return booleanSearch(matrix,r,target);
    }
    public static boolean booleanSearch(int [][] matrix, int r, int target){
        int s=0, e=matrix[0].length;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(matrix[r][mid]==target)
                return true;
            else if(matrix[r][mid]>target)
                e=mid-1;
            else
                s=mid+1;
        }
        return false;
    }
}