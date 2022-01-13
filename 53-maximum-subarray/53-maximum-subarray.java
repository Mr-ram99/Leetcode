class Solution {
    public int maxSubArray(int[] nums) {
        int i,sum=0,max=Integer.MIN_VALUE;
        for(i=0;i<nums.length;i++)
        {
            sum += nums[i];
            if(sum>max)
                max = sum;
            if(sum<0)
                sum = 0;
        }
        return max;
    }
}