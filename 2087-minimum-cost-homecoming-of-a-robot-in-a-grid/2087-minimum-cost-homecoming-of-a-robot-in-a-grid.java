class Solution {
    public int minCost(int[] startPos, int[] homePos, int[] rowCosts, int[] colCosts) {
        int m = startPos[0];
        int n = startPos[1];
        int x = homePos[0];
        int y = homePos[1];
        int ans = calc(m,n,x,y,rowCosts,colCosts);
        return ans;
    }
    public static int calc(int m, int n, int x, int y,int [] rowCosts, int [] colCosts)
    {
        int i,sum=0;
        if(m<x && n<y)
        {
            for(i=m+1;i<=x;i++)
            {
                sum+=rowCosts[i];
            }
            for(i=n+1;i<=y;i++)
            {
                sum+=colCosts[i];
            }
            return sum;
        }
        if(m>x && n<y)
        {
           for(i=m-1;i>=x;i--)
            {
                sum+=rowCosts[i];
            }
            for(i=n+1;i<=y;i++)
            {
                sum+=colCosts[i];
            }
            return sum;
        }
        if(m>x && n>y)
        {
            for(i=m-1;i>=x;i--)
            {
                sum+=rowCosts[i];
            }
            for(i=n-1;i>=y;i--)
            {
                sum+=colCosts[i];
            }
            return sum;
        }
        if(m<x && n>y)
        {
            for(i=m+1;i<=x;i++)
            {
                sum+=rowCosts[i];
            }
            for(i=n-1;i>=y;i--)
            {
                sum+=colCosts[i];
            }
            return sum;
        }
        if(m==x && n<y)
        {
            for(i=n+1;i<=y;i++)
                sum+=colCosts[i];
            return sum;
        }
        if(m==x && n>y)
        {
            for(i=n-1;i>=y;i--)
                sum+=colCosts[i];
            return sum;
        }
        if(m<x && n==y)
        {
            for(i=m+1;i<=x;i++)
                sum+=rowCosts[i];
            return sum;
        }
        if(m>x && n==y)
        {
            for(i=m-1;i>=x;i--)
                sum+=rowCosts[i];
            return sum;
        }
        return 0;
    }
}