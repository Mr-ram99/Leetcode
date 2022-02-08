class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int [] prefix = new int[n];
        prefix[0] = nums[0];
        int count=0;
        for(int i=1;i<n;i++)
        {
            prefix[i] = nums[i] + prefix[i-1];
        }
        for(int i=0;i<n;i++)
        {
            if(prefix[i]==k)
                count++;
            for(int j=i-1;j>=0;j--)
            {
                if(prefix[i]-prefix[j]==k)
                    count++;
            }
        }
        
        return count;
    }
}