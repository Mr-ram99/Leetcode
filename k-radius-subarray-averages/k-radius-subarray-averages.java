class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        if(k==0)
            return nums;
        int [] ans = new int[n];
        int i,j;
        long sum=0;
        for(i=0;i<n && i<=2*k;i++)
        {
            sum+=nums[i];
        }
        for(i=0;i<n;i++)
        {
            ans[i] = -1;
        }
        for(i=k;i<n-k;i++)
        {
            if(i>k)
                sum = sum - nums[i-k-1] + nums[i+k];
            ans[i] = (int)(sum/(2*k+1));
        }
        return ans;
    }
}