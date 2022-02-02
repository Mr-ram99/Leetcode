class Solution {
    public int minSteps(String s, String t) {
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(char ch: s.toCharArray())
        {
            if(map1.containsKey(ch))
                map1.put(ch,map1.get(ch)+1);
            else
                map1.put(ch,1);
        }
        for(char ch: t.toCharArray())
        {
            if(map2.containsKey(ch))
                map2.put(ch,map2.get(ch)+1);
            else
                map2.put(ch,1);
        }
        int sum=0;
        for(Map.Entry<Character, Integer> entry: map1.entrySet())
        {
            char ch = entry.getKey();
            int val1 = entry.getValue();
            int val2 = map2.containsKey(ch)?map2.get(ch):0;
            if(val1>=val2)
            {
                sum += val1-val2;
            }
        }
        return Math.abs(sum);
    }
}