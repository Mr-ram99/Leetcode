class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int max=0, max2=0, maxIndex=0;
        for(int i=0;i<n;i++){
            if(nums[i]>max)
            {
                max = nums[i];
                maxIndex = i;
            }
        }
        
        for(int i=0;i<n;i++){
            if(nums[i]>max2 && i!=maxIndex)
            {
                max2 = nums[i];
            }
        }
        return (max-1)*(max2-1);
    }
}