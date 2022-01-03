class Solution {
    public int findJudge(int n, int[][] trust) {
        if(trust.length==0 && n==1)
            return n;
        int [] arr = new int[1001];
        int i,ans=-1;
        for(i=0;i<trust.length;i++)
        {
            arr[trust[i][1]]++;
        }
        for(i=0;i<=1000;i++)
        {
            if(arr[i]==n-1)
                ans = i;
        }
        for(i=0;i<trust.length;i++)
        {
            if(trust[i][0]==ans)
                return -1;
        }
        return ans;
    }
}