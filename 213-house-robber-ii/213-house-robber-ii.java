class Solution {
    public int rob(int[] nums) {
        if(nums.length==1)
            return nums[0];
        if(nums.length<=2)
            return nums[0]>nums[1]?nums[0]:nums[1];
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            int temp =helper(nums,i);
            if(max<temp)
                max = temp;
        }
        return max;
    }
    public static int helper(int[] nums,int k)
    {
        int n = nums.length;
        int prev = nums[k];
        int prev2 = nums[k]>nums[(k+1)%n]?nums[k]:nums[(k+1)%n];
        int cur = prev2;
        for(int i=k+2,j=0;j<n-3;i++,j++)
        {
            i=i%n;
            cur = Math.max(prev2,prev+nums[i]);
            prev = prev2;
            prev2 = cur;
        }
        return cur;
    }
}