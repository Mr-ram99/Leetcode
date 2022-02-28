class Solution {
    public long countPairs(int[] nums, int k) {
        int n = nums.length;
        if(k==1)
            return ((long)n*(long)(n-1))/2;
        HashMap<Integer,Integer> cnt = new HashMap<>();
        long count=0;
        for(int i=0;i<nums.length;i++){
            int gcd1 = gcd(nums[i],k);
            int gcd2 = k/gcd1;
            if(gcd2 == 1)
                count += i;
            else {
                for(Map.Entry<Integer,Integer> entry: cnt.entrySet()){
                    if(entry.getKey()%gcd2 == 0){
                        count += entry.getValue();
                    }
                }
            }
            cnt.put(gcd1, cnt.getOrDefault(gcd1,0)+1);
        }
        return count;
    }
    int gcd(int x, int y){
        if (x < y) {
            return gcd(y, x);
        }
        return y == 0 ? x : gcd(y, x % y);
    }
}