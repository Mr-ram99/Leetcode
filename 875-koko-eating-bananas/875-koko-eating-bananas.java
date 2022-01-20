class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int i, j, n = piles.length;
        int max = piles[0], min= piles[0];
        
        if(n==1)
        {
            if(piles[0]%h==0)
                return piles[0]/h;
            return piles[0]/h+1;
        }
        
        for(i=1;i<n;i++)
        {
            if(piles[i]>max)
                max = piles[i];
            if(piles[i]<min)
                min = piles[i];
        }
        i = 1; 
        j = max;
        int mid;
        while(i<j)
        {
            mid = i + (j-i)/2;
            if(check(piles,mid,h))
                j=mid;
            else
                i=mid+1;
        }
        return j;
    }
    public static boolean check(int[] piles, int mid, int h)
    {
        int sum=0;
        for(int i=0;i<piles.length;i++)
        {
            if(piles[i]%mid==0)
                sum+=piles[i]/mid;
            else
                sum+=piles[i]/mid+1;
        }
        if(sum<=h)
            return true;
        return false;
            
    }
}