class Solution {
    public List<Integer> findLonely(int[] nums) {
        int max = nums[0];
        int i,n=nums.length;
        List<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        if(n==1)
        {
            ans.add(nums[0]);
                return ans;
        }
        for(i=0;i<n;i++)
        {
            if(!map.containsKey(nums[i]))
                map.put(nums[i],1);
            else
                map.put(nums[i],map.get(nums[i])+1);
        }
        for(i=0;i<n;i++)
        {
            int p = map.get(nums[i]);
            if(p>1)
                continue;
            if(map.containsKey(nums[i]-1))
                continue;
            if(map.containsKey(nums[i]+1))
                continue;
            ans.add(nums[i]);
        }
        return ans;
    }
}