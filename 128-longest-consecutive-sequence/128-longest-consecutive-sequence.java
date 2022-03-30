class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i]-1)){
                int n=nums[i];
                int c=0;
                while(set.contains(n)){
                    c++;
                    n++;
                }
                ans = Math.max(ans, c);
            }
        }
        return ans;
    }
}