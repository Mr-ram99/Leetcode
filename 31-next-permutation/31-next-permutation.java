class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int i=n-2,j,temp;
        while(i>=0 && nums[i]>=nums[i+1])i--;
        if(i>=0){
            j=n-1;
            while(nums[i]>=nums[j])j--;
             temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        i++;
        for(j=n-1;i<j;i++,j--){
            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        
    }
}