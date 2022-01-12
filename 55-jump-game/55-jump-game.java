class Solution {
    public boolean canJump(int[] nums) {
        int maxindex=0;
        int i=0;
        while(i<=maxindex)
        {
            int temp = i+nums[i];
            if(temp>maxindex)
                maxindex = temp;
            if(maxindex>=nums.length-1)
                break;
            i++;
        }
        if(maxindex>=nums.length-1)
            return true;
        else
            return false;
    }
}