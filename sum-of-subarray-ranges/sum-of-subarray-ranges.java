class Solution {
    public long subArrayRanges(int[] nums) {
        int i,j;
        long min,max,res=0;
        for(i=0;i<nums.length;i++)
        {
            min = nums[i];
            max = nums[i];
            for(j=i;j<nums.length;j++)
            {
                min = Math.min(min,nums[j]);
                max = Math.max(max,nums[j]);
                res += max-min;
            }
        }
        return res;
    }
}