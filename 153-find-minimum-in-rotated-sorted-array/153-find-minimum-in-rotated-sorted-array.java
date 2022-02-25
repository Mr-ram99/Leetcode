class Solution {
    public int findMin(int[] nums) {
        int pivot = findPivot(nums);
        int len = nums.length;
        if(pivot==-1)
            return nums[0];
        else
            return nums[(pivot+1)%len];
    }
    
    public static int findPivot(int[] nums)
    {
        int start=0,  end=nums.length-1;
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            if(mid<end && nums[mid]>nums[mid+1])
                return mid;
            if(mid>start && nums[mid]<nums[mid-1])
                return mid-1;
            if(nums[start]<nums[mid])
                start = mid+1;
            else 
                end = mid-1;
        }
        return -1;
    }
}