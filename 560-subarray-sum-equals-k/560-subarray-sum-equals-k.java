class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int sum=0, count=0;
        for(int i=0;i<n;i++)
        {
            sum += nums[i];
            if(map.containsKey(sum-k))
                count += map.get(sum-k);
            map.put(sum, map.getOrDefault(sum,0)+1);
        }
        
        return count;
    }
}