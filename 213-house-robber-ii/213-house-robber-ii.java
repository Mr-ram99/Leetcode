class Solution {
    public int rob(int[] nums) {
        if(nums.length==1)
            return nums[0];
        if(nums.length==2)
            return nums[0]>nums[1]?nums[0]:nums[1];
        if(nums.length==3)
        {
            int m = Math.max(nums[0],nums[1]);
            return (int)Math.max(m,nums[2]);
        }
        int temp1 =helper(nums,0);
        int temp2 =helper(nums,1);
        return (int)Math.max(temp1,temp2);
    }
    public static int helper(int[] nums,int k)
    {
        int n = nums.length;
        int prev,prev2,cur=0;
        if(k==0)
        {
            prev = nums[0];
            prev2 = nums[1]>nums[0]?nums[1]:nums[0];
            cur = prev2;
            for(int i=2;i<n-1;i++)
            {
                cur = Math.max(prev+nums[i],prev2);
                prev = prev2;
                prev2 =cur;
            }
        }
        if(k==1)
        {
            prev = nums[1];
            prev2 = nums[1]>nums[2]?nums[1]:nums[2];
            cur = prev2;
            for(int i=3;i<n;i++)
            {
                cur = Math.max(prev+nums[i],prev2);
                prev = prev2;
                prev2 =cur;
            }
        }
        return cur;
    }
}