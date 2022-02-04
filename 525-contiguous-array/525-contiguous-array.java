class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        int max=0, count=0;
        for(int i=0;i<n;i++)
        {
            count = count + (nums[i]==0?-1:1);
            if(!map.containsKey(count))
            {
                map.put(count,i);
            }
            else
            {
                max = Math.max(max, i - map.get(count));
            }
        }
        return max;
    }
}