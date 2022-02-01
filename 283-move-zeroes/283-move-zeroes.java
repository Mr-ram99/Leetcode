class Solution {
    public void moveZeroes(int[] nums) {
        int zeroIndex = 0;
        int index = 0;
        int n = nums.length;
        while(zeroIndex<n && index<n)
        {
            while(zeroIndex<n && nums[zeroIndex]!=0)
                zeroIndex++;
            if(zeroIndex==n)
                break;
            index = zeroIndex;
            while(index<n && nums[index]==0)
                index++;
            if(index==n)
                break;
            int temp = nums[zeroIndex];
            nums[zeroIndex] = nums[index];
            nums[index] = temp;
        }
    }
}