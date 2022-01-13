class Solution {
    public int maxProduct(int[] nums) {
        int left=1,right=1,leftmax=Integer.MIN_VALUE,rightmax=Integer.MIN_VALUE;
        int n = nums.length;
        boolean containszero = false;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==0)
            {
                left = 1;
                containszero = true;
                continue;
            }
            left *= nums[i];
            if(left>leftmax)
                leftmax = left;
        }
        
        for(int i=n-1;i>=0;i--)
        {
            if(nums[i]==0)
            {
                right = 1;
                continue;
            }
            right *= nums[i];
            if(right>rightmax)
                rightmax = right;
        }
        if(containszero)
            return Math.max(Math.max(leftmax,rightmax),0);
        return Math.max(leftmax,rightmax);
    }
}