class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length, i, x=0, ones=0, maxOnesInWindow=0;
        for(int a:nums)
            if(a==1)
                ones++;
        for(i=0;i<n+ones;i++)
        {
            if(i>=ones && nums[(i-ones)%n]==1) x--;
            if(nums[i%n]==1)
                x++;
            maxOnesInWindow = Math.max(x,maxOnesInWindow);
        }
        return ones - maxOnesInWindow;
    }
}