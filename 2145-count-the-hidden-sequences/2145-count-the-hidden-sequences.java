class Solution {
    public int numberOfArrays(int[] differences, int lower, int upper) {
        long min=0, max = 0,ans=0;
        int n = differences.length,i;
        long a=0;
        for(i=0;i<n;i++)
        {
            a+=differences[i];
            max = Math.max(max,a);
            min = Math.min(min,a);
        }
        ans = (upper-lower+1) - (max-min);
        if(ans>0)
            return (int)ans;
        return 0;
    }
}