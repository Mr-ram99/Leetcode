class Solution {
    public int wordCount(String[] startWords, String[] targetWords) {
        HashSet<String> set = new HashSet<>();
        int count=0;
        for(String s : startWords)
        {
            char [] ch = s.toCharArray();
            Arrays.sort(ch);
            set.add(new String(ch));
        }
        for(String s : targetWords)
        {
            char [] ch = s.toCharArray();
            Arrays.sort(ch);
            String p = new String(ch);
            for(int i=0;i<p.length();i++)
            {
                String k = p.substring(0,i)+p.substring(i+1,p.length());
                if(set.contains(k))
                {
                    count++;
                    break;
                }
                
            }
        }
        return count;
    }
}