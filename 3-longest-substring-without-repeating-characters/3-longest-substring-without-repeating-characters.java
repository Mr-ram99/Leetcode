class Solution {
    public int lengthOfLongestSubstring(String s) {
        int [] chars = new int[255];
        Arrays.fill(chars,-1);
        int start=0, max=0, len=0;
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(chars[ch]==-1 || start>chars[ch])
            {
                len = i - start + 1;
                chars[ch]=i;
            }
            else 
            {
                if(len>max)
                    max = len;
                start = chars[ch]+1;
                chars[ch]=i;
            }
            
        }
        if(len>max)
            max = len;
        return max;
    }
}