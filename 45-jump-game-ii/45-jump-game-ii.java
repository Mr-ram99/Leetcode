class Solution {
    public int jump(int[] nums) {
        if(nums.length==1)
            return 0;
        if(nums.length==2)
            return 1;
        int steps=0, max = 0, n=nums.length-1,temp=0;
        for(int i=0;i<n;i++)
        {
            max = Math.max(max,i+nums[i]);
            if(temp==i)
            {
                steps++;
                temp= max;
            }
        }
        return steps;
    }
}