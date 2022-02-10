class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0;i<s.length()-9;i++)
        {
            String str = s.substring(i,i+10);
            map.put(str, map.getOrDefault(str,0)+1);
        }
        List<String> ans = new ArrayList<>();
        for(Map.Entry<String,Integer> entry: map.entrySet())
        {
            if(entry.getValue()>1)
                ans.add(entry.getKey());
        }
        return ans;
    }
    
}