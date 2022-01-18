class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int i,count=0;
        int len = flowerbed.length;
        if(n==0)
            return true;
        if(len==1)
        {
            if(flowerbed[0]==0 && n<=1)
                return true;
            return false;
                
        }
        for(i=0;i<len;i++)
        {
            if(flowerbed[i]==0)
            {
                if(i==0 && i+1<len && flowerbed[i+1]==0)
                   {
                    flowerbed[i] = 1;
                    count++;
                }
                else if(i==len-1 && i-1>=0 && flowerbed[i-1]==0)
                   {
                    flowerbed[i] = 1;
                    count++;
                }
                else if(i+1<len && flowerbed[i+1]==0 && i-1>=0 && flowerbed[i-1]==0)
                {
                    flowerbed[i] = 1;
                    count++;
                }
            }
        }
        if(count>=n)
            return true;
        return false;
    }
}