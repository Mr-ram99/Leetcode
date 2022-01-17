class Solution {
    public boolean wordPattern(String pattern, String s) {
        int n = s.length();
        String [] str = s.split(" ");
        HashMap<Character,String> map= new HashMap<>();
        if(str.length!=pattern.length())
            return false;
        for(int i=0;i<pattern.length();i++)
        {
            char ch = pattern.charAt(i);
            if(!map.containsKey(ch) && !map.containsValue(str[i]))
            {
                map.put(ch,str[i]);
            }
            else{
                if(!str[i].equals(map.get(ch)))
                    return false;
            }
        }
        return true;
    }
}