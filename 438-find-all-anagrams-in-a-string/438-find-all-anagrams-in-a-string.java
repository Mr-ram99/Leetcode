class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        int [] chars = new int[26];
        int i, j, diff=p.length();
        List<Integer> ans = new ArrayList<>();
        if(s.length()<p.length())
            return ans;
        for(i=0;i<p.length();i++){
            chars[p.charAt(i)-'a']++;
        }
        for(i=0;i<p.length();i++){
            chars[s.charAt(i)-'a']--;
            if(chars[s.charAt(i)-'a']>=0)
                diff--;
        }
        if(diff==0)
            ans.add(0);
        j=0;
        while(i<s.length()){
            char c = s.charAt(i);
            char d = s.charAt(j);
            if(chars[d-'a']>=0)
                diff++;
                chars[d-'a']++;
            j++;
            
            chars[c-'a']--;
            if(chars[c-'a']>=0)
                diff--;
            
            i++;
            
            if(diff==0)
                ans.add(j);
            
            
        }
        return ans;
        
    }
}