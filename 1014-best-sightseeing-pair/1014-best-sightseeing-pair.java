class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int i,j,max=values[0]+0,ans=-1;
        int n = values.length;
        for(i=1;i<n;i++)
        {
            ans = Math.max(ans,max+values[i]-i);
            max = Math.max(max,values[i]+i);
        }
        return ans;
    }
}