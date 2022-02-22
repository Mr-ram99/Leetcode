class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        List<Character> [] bucket = new List[n+1];
        for(Map.Entry<Character,Integer> m:map.entrySet()){
            if(bucket[m.getValue()] == null){
                bucket[m.getValue()] = new ArrayList<>();
            }
            bucket[m.getValue()].add(m.getKey());
        }
        StringBuilder sb = new StringBuilder();
        for(int i=n;i>=0;i--){
            if(bucket[i]==null)
                continue;
            for(char ch:bucket[i]){
                for(int j=0;j<i;j++)
                    sb.append(ch);
            }
        }
        return sb.toString();
    }
}