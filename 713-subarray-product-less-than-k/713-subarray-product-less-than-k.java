class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int i=0,j=0,n=nums.length;
        int c=0, p=1;
        if(k<=1)
            return 0;
        while(j<n){
            p *= nums[j];
            while(i<n && p>=k){
                p/=nums[i];
                i++;
            }
            c += j-i+1;
            j++;
        }
        return c;
    }
}