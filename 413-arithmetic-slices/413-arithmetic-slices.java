class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int i=0, n = nums.length;
        if(n<3)
            return 0;
        int [] diff = new int[n-1];
        int count=1, total=0;
        for(i=0;i<n-1;i++){
            diff[i] = nums[i+1] - nums[i];
        }
        for(i=1;i<n-1;i++){
            if(diff[i] == diff[i-1])
                count++;
            else{
                total += (count*(count-1))/2;
                count=1;
            }
        }
        total += (count*(count-1))/2;
        return total;
    }
}