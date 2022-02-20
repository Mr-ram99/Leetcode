class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n= nums.length;
        int [] ans = new int[n];
        int j=0,k=1;
        for(int i=0;i<n;i++){
            if(nums[i]%2==0)
            {
                ans[j] = nums[i];
                j+=2;
            }
            else
            {
                ans[k] = nums[i];
                k+=2;
            }
        }
        return ans;
            
    }
}