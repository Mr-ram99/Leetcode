class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int [] res = new int[n];
        int s=0, e=n-1;
        int j=n-1;
        while(s<=e)
        {
            if(Math.abs(nums[s])<Math.abs(nums[e]))
            {
                res[j--] = nums[e]*nums[e];
                e--;
            }
            else
            {
                res[j--] = nums[s]*nums[s];
                s++;
            }
        }
        return res;
    }
}