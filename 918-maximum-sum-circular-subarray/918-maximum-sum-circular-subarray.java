class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        
        int i,sum=0,n=nums.length; 
        
         for(int a:nums)
             sum+=a;
         if(n==1)
             return sum;
//         for one-interval subarray
        int ans1 = Integer.MIN_VALUE;
        int cur = Integer.MIN_VALUE;
        for(int a:nums)
        {
                cur = a + Math.max(cur,0);
                ans1 = Math.max(ans1,cur);
        }
//         ans2 for two interval subarray (sum-ans2)
        int ans2 = Integer.MAX_VALUE;
        cur = Integer.MAX_VALUE;
        for(i=0;i<n-1;i++)
        {
                cur = nums[i] + Math.min(cur,0);
                ans2 = Math.min(ans2,cur);
        }
        ans2 = sum-ans2;
//         ans3 for two interval subarray (sum-ans3)
        int ans3 = Integer.MAX_VALUE;
        cur = Integer.MAX_VALUE;
        for(i=1;i<n;i++)
        {
                cur = nums[i] + Math.min(cur,0);
                ans3 = Math.min(ans3,cur);
        }
        ans3 = sum-ans3;
        
        return Math.max(ans1,Math.max(ans2,ans3));
    }
}