class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        int len_p = p.length();
        int len_s = s.length();
        
        if(len_s==0 || len_p==0 || len_p>len_s)
            return res;
        
        int i, start = 0, end = 0, diff=len_p;
        char ch;
        int [] chars = new int[26];
        
        for(i=0;i<len_p;i++)
        {
            ch = p.charAt(i);
            chars[ch-'a']++;
        }
        
        while(end<len_p)
        {
            ch = s.charAt(end);
            chars[ch-'a']--;
            
            if(chars[ch-'a']>=0)
                diff--;
            end++;
        }
        if(diff==0)
            res.add(0);
        
        while(end<len_s)
        {
            ch = s.charAt(start);
            if(chars[ch-'a']>=0)
                diff++;
            chars[ch-'a']++;
            start++;
            
            ch = s.charAt(end);
            chars[ch-'a']--;
            if(chars[ch-'a']>=0)
                diff--;
            
            end++;
            
            if(diff==0)
                res.add(start);
        }
    return res;  
    }
}