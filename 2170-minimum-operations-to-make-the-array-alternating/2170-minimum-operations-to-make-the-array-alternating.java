class Solution {
    public int minimumOperations(int[] nums) {
        if(nums.length==1)
            return 0;
        if(nums.length==2){
            if(nums[0]==nums[1])
                return 1;
            else
                return 0;
        }
        HashMap<Integer,Integer> odd = new HashMap<>();
        HashMap<Integer,Integer> even = new HashMap<>();
        int oddmax=0, evenmax = 0, n=nums.length, emax=nums[0], omax = nums[1];
        for(int i=0;i<n;i+=2){
                even.put(nums[i], even.getOrDefault(nums[i],0)+1);
                if(even.get(nums[i])>evenmax)
                {
                    evenmax = even.get(nums[i]);
                    emax = nums[i];
                }
        }
        for(int i=1;i<n;i+=2){
              odd.put(nums[i], odd.getOrDefault(nums[i],0)+1);
                if(odd.get(nums[i])>oddmax)
                {
                    oddmax = odd.get(nums[i]);  
                    omax = nums[i];
                }
        }
        if(emax==omax){
            if(evenmax>oddmax){
                int newoddmax = 0;
                for(Map.Entry<Integer,Integer> entry:odd.entrySet()){
                    if(entry.getKey()!=emax && entry.getValue()>newoddmax){
                        newoddmax = entry.getValue();
                    }
                }
                oddmax = newoddmax;
            }
            else
            {
                int newevenmax = 0;
                for(Map.Entry<Integer,Integer> entry:even.entrySet()){
                    if(entry.getKey()!=omax && entry.getValue()>newevenmax){
                        newevenmax = entry.getValue();
                    }
                }
                evenmax = newevenmax;
            }
        }
        return (n+1)/2-evenmax + n/2 - oddmax;
    }
}