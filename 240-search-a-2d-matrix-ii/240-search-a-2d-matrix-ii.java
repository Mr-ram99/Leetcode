class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i,j,r=matrix.length,c=matrix[0].length;
        i=0;
        j=c-1;
        while(i<=j)
        {
            int mid = i + (j-i)/2;
            if(matrix[0][mid]==target)
                return true;
            else if(matrix[0][mid]>target)
                j=mid-1;
            else
                i=mid+1;
        }
        
        int colEnd = i;
        i=0;
        j=r-1;
        while(i<=j)
        {
            int mid = i + (j-i)/2;
            if(matrix[mid][0]==target)
                return true;
            else if(matrix[mid][0]>target)
                j=mid-1;
            else
                i=mid+1;
        }
        int rowEnd = i;
        if(colEnd==0 || rowEnd==0)
            return false;
        for(i=0;i<colEnd;i++)
        {
            if(matrix[0][i]<=target && matrix[rowEnd-1][i]>=target)
            {
                int p=0, q=rowEnd-1;
                while(p<=q)
                {
                    int mid = p + (q-p)/2;
                    if(matrix[mid][i]==target)
                        return true;
                    else if(matrix[mid][i]>target)
                        q=mid-1;
                    else
                        p=mid+1;
                }
            }
        }
        return false;
    }
    
}