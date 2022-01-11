class Solution {
    public int rob(int[] nums) {
        if(nums.length==1)
            return nums[0];
        if(nums.length<=2)
            return nums[0]>nums[1]?nums[0]:nums[1];
        int prev = nums[0];
        int prev2 = nums[0]>nums[1]?nums[0]:nums[1];
        int cur = 0;     //value doesn't matter
        for(int i=2;i<nums.length;i++)
        {
            cur = Math.max(prev2,prev+nums[i]);
            prev = prev2;
            prev2 = cur;
        }
        return cur;
    }
}