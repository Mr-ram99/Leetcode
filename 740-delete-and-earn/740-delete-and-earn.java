class Solution {
    public int deleteAndEarn(int[] nums) {
        int max = nums[0];
        int n=nums.length;
        if(n==1)
            return nums[0];
        for(int i=0;i<n;i++){
            max = Math.max(max, nums[i]);
        }
        int [] dp = new int[max+1];
        int [] f = new int[max+1];
        for(int i=0;i<n;i++){
            f[nums[i]]++;
        }
        dp[1] = f[1];
        dp[2] = Math.max(f[1], 2*f[2]);
        for(int i=2;i<max+1;i++){
            dp[i] = Math.max(dp[i-1], dp[i-2]+f[i]*i);
        }
        return dp[max];
    }
    
}