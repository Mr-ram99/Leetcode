class Solution {
    public int minimumDeviation(int[] nums) {
        int n = nums.length;
        TreeSet<Integer> set = new TreeSet<>();
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
            set.add(nums[i]);
            }
            else
                set.add(nums[i]*2);
        }
        int diff = set.last() - set.first();
        while(set.last()%2==0){
            int m = set.last();
            set.remove(m);
            set.add(m/2);
            diff = Math.min(diff,set.last()-set.first());
        }
        return diff;
    }
}