class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> neg = new ArrayList<>();
        List<Integer> pos = new ArrayList<>();
        int i,j,n=nums.length;
        for(i=0;i<n;i++)
        {
            if(nums[i]>0)
                pos.add(nums[i]);
            else
                neg.add(nums[i]);
        }
        i=0;
        j=0;
        while(i<n/2)
        {
            nums[j++] = pos.get(i);
            nums[j++] = neg.get(i);
            i++;
        }
        return nums;
    }
}