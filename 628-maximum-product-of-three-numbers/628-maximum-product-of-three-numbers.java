class Solution {
    public int maximumProduct(int[] nums) {
        int n= nums.length;
        if(nums.length==3)
        {
            return nums[0]*nums[1]*nums[2];
        }
        Arrays.sort(nums);
        int neg=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                neg++;
            }
        }
        if(neg<1){
            return nums[n-1]*nums[n-2]*nums[n-3];
        }
        if(neg==2){
            return Math.max(nums[0]*nums[1]*nums[n-1], Math.max(nums[0]*nums[1]*nums[2], nums[n-1]*nums[n-2]*nums[n-3]));
        }
         return Math.max(nums[0]*nums[1]*nums[n-1], nums[n-1]*nums[n-2]*nums[n-3]);
    }
}