class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int c=nums.length, n=nums.length;
        int j=0, sum=0;
        boolean flag = false;
        for(int i=0;i<n;i++){
            sum += nums[i];
            while(sum>=target){
                 c =  Math.min(c, i-j+1);
                 sum-=nums[j++];
                flag = true;
            }
           
        }
        if(flag)
            return c;
        return 0;
    }
}