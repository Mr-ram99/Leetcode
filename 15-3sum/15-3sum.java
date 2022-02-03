class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int i, lo, hi, rem, sum;
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for(i=0;i<n-1;i++)
        {
            lo = i+1;
            hi = n-1;
            rem = -(nums[i]);
            while(lo<hi)
            {
                sum = nums[lo] + nums[hi];
                if(sum>rem)
                    hi--;
                else if(sum<rem)
                    lo++;
                else
                {
                    List<Integer> li = new ArrayList<>();
                    li.add(nums[i]);
                    li.add(nums[lo]);
                    li.add(nums[hi]);
                    res.add(new ArrayList<>(li));
                    while(lo<hi && nums[lo]==li.get(1))
                     lo++;
                    while(lo<hi && nums[hi]==li.get(2))
                        hi--;
                }
            }
            while(i<n-1 && nums[i]==nums[i+1])
                        i++;
        }
        return res;
    }
}