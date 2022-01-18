class Solution {
    public int getMaxLen(int[] nums) {
        int n = nums.length;
        int product=1,count=0,max1=0,max2=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==0)
            {
                count=0;
                product=1;
                continue;
            }
            count++;
            if(nums[i]<0)
            product = -product;
            if(product>0 && count>max1)
                max1 = count;
        }
        count=0;
        product=1;
        for(int i=n-1;i>=0;i--)
        {
             if(nums[i]==0)
            {
                count=0;
                product=1;
                continue;
            }
            count++;
            if(nums[i]<0)
            product = -product;
            if(product>0 && count>max2)
                max2 = count;
        }
        return (int)Math.max(max1,max2);
    }
}