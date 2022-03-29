class Solution {
    public int findDuplicate(int[] nums) {
        int correctIndex;
        for(int i=0;i<nums.length;i++){
            correctIndex = nums[i]-1;
            if(nums[correctIndex]!=nums[i]){
                int temp = nums[correctIndex];
                nums[correctIndex] = nums[i];
                nums[i]=temp;
                i--;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                return nums[i];
            }
        }
        return -1;
    }
}