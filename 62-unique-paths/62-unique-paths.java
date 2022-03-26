class Solution {
    public int uniquePaths(int m, int n) {
        long ans=1;
        long min = (long)Math.min(m,n);
        long j=1;
        for(int i=m+n-2;j<min;i--,j++){
            ans *= i;
            ans /= j;
        }
        return (int)ans;
    }
}