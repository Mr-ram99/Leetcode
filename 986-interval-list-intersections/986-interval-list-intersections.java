class Solution {
    public int[][] intervalIntersection(int[][] f, int[][] s) {
        int i=0,j=0;
        List<int[]> ans = new ArrayList<>();
        while(i<f.length && j<s.length){
            int lo = Math.max(f[i][0],s[j][0]);
            int hi = Math.min(f[i][1], s[j][1]);
            if(lo<=hi){
                ans.add(new int[]{lo,hi});
            }
            if(f[i][1]<s[j][1])
                i++;
            else
                j++;
        }
        return ans.toArray(new int[ans.size()][]);
    }
}