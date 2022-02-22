class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<Map.Entry<Integer, Integer> > list = new LinkedList<>(map.entrySet());
 
        Collections.sort(list,(i1,i2) -> i2.getValue().compareTo(i1.getValue()));
 
        HashMap<Integer, Integer> temp = new HashMap<Integer, Integer>();
        int [] res =new int[k];
        int i=0;
        for (Map.Entry<Integer, Integer> a: list) {
            res[i] = a.getKey();
            i++;
            if(i==k)
                break;
        }
        return res;
    }
}