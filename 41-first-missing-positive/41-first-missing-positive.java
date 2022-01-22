class Solution {
    public int firstMissingPositive(int[] nums) {
        int ci, i, max = Integer.MIN_VALUE;
        HashSet<Integer> set = new HashSet<>();
        for(i=0;i<nums.length;)
        {
            if(nums[i]>0 && nums[i]<nums.length){
                ci = nums[i]-1;
                if(i!=ci && !set.contains(nums[i])){
                    set.add(nums[i]);
                    int temp = nums[i];
                    nums[i] = nums[ci];
                    nums[ci] = temp;
                    }
                else i++;
            }  
            else i++;
        }
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]!=i+1)
                return i+1;
        }
        return nums.length+1;
    }
}