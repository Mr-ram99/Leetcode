class Solution {
    public int minimumDeletions(int[] nums) {
        int i, n=nums.length, min=nums[0], max = nums[0], minindex=0, maxindex =0,ans;
        for(i=0;i<n;i++)
        {
            if(nums[i]>max)
                {
                max= nums[i];
                maxindex = i;
            }
            if(nums[i]<min)
                {
                min = nums[i];
                minindex = i;
            }
        }
        int first = (int)Math.min(minindex,maxindex);
        int last = (int)Math.max(minindex,maxindex);
        if(first==last)
        {
            ans = (int)Math.min(n-last,first+1);
        }
        else{
            int a = (int)Math.min(last+1,n-first);
            ans = (int)Math.min(a,first+1+n-last);
        }
        return ans;
    }
}