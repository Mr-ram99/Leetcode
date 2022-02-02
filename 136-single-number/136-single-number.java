class Solution {
    public int singleNumber(int[] nums) {
        int i=1;
        int ans = nums[0];
        while(i<nums.length)
        {
            ans = ans^nums[i];
            i++;
        }
        return ans;
    }
}