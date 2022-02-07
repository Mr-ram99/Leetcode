class Solution {
    public char findTheDifference(String s, String t) {
        int [] ch = new int[26];
        for(int i=0;i<s.length();i++)
        {
            ch[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++)
        {
            if(ch[t.charAt(i)-'a']==0)
                return t.charAt(i);
            else
                ch[t.charAt(i)-'a']--;
        }
        return '0'; // dummy return 
    }
}