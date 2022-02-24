class Solution {
    public int[] searchRange(int[] nums, int target) {
        int [] ans =new int[2];
        ans[0] = search(nums, target, true);
        if(ans[0]!=-1)
            ans[1] = search(nums, target, false);
        else
            ans[1]=-1;
        return ans;
    }
    public int search(int [] nums, int target, boolean isFirstIndex)
    {
        int start=0, end=nums.length-1, mid, ans=-1;
        while(start<=end)
        {
            mid = start + (end-start)/2;
             if(nums[mid]>target)
             {
                 end = mid-1;
             }
            else if(nums[mid]<target)
            {
                start = mid+1;   
            }
            else
            {
                 ans = mid;
                if(isFirstIndex)
                    end = mid-1;
                else
                    start = mid+1;
            }
        }
        return ans;
    }
}