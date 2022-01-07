class Solution {
    public int rob(int[] nums) {
//         with space
        // int [] dp = new int[nums.length];
        // dp[0] = nums[0];
        // if(nums.length==1)
        //     return nums[0];
        // dp[1] = Math.max(nums[0],nums[1]);
        // for(int i=2;i<nums.length;i++)
        // {
        //     dp[i] = Math.max(dp[i-2]+nums[i],dp[i-1]);
        // }
        // return dp[dp.length-1];
//         without space
        int dp = nums[0];
        if(nums.length==1)
            return nums[0];
        int dp1 = Math.max(nums[0],nums[1]);
        int dp2 = dp1;;
        for(int i=2;i<nums.length;i++)
        {
            dp2 = Math.max(dp+nums[i],dp1);
            dp = dp1;
            dp1 = dp2;
        }
        return dp2;
    }
}