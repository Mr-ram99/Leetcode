class Solution {
    public int removeDuplicates(int[] nums) {
        int k=0, i,j, n=nums.length, count=0;
        if(n<=2)
            return n;
        
        for(i=0,j=1;i<n-1;i++,j++)
        {
            if(nums[i]==nums[j] && count<1)
            {
                if(i==0)
                    nums[k++]= nums[i];
                nums[k++]= nums[j];
                count++;
            }
            if(nums[i]!=nums[j])
            {
                if(i==0)
                    nums[k++]=nums[i];
                nums[k++] = nums[j];
                count=0;
            }
            
        }
        return k;
    }
}