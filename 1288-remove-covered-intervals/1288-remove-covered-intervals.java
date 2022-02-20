class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a,b)->a[0]>b[0]?1:(a[0]==b[0]?a[1]<b[1]?1:-1:-1));
        int start = intervals[0][0], end = intervals[0][1], count=0;
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]>=start && intervals[i][1]<=end)
                count++;
            else
            {
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        return intervals.length - count;
    }
}