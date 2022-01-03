class Solution {
    public void sortColors(int[] nums) {
        int count0=0,count1=0,count2=0;
        int i;
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
                count0++;
            if(nums[i]==1)
                count1++;
            if(nums[i]==2)
                count2++;
        }
        i=0;
        while(count0-->0)
            nums[i++]=0;
        while(count1-->0)
            nums[i++]=1;
        while(count2-->0)
            nums[i++]=2;
    }
}