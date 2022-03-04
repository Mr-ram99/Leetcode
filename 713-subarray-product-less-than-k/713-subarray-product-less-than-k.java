class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int i=0,j=0,n=nums.length;
        List<Integer> list = new ArrayList<>();
        int c=0, product=1;
        for(i=0;i<n;i++){
            if(nums[i]<k)
                c++;
            product = nums[i];
            if(product>k)
                continue;
            for(j=i+1;j<n;j++){
                product *= nums[j];
                if(product<k)
                    c++;
                else
                    break;
            }
        }
        return c;
    }
}