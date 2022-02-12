class Solution {
    public int maxEvents(int[][] events) {
        int n = events.length;
        int max = 1, ans =0;
        Arrays.sort(events, (a,b)->a[1]>b[1]?1:a[1]==b[1]?a[0]>b[0]?1:-1:-1);
        max = events[n-1][1];
        TreeSet<Integer> set = new TreeSet<>();
        for(int i=1;i<=max;i++)
        {
            set.add(i);
        }
        for(int i=0;i<n;i++)
        {
            if(set.ceiling(events[i][0])==null)
                break;
            int avail = set.ceiling(events[i][0]);
            if(avail>events[i][1])
                continue;
            ans++;
            set.remove(avail);
        }
        return ans;
    }
}