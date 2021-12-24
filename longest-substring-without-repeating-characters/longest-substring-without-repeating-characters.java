class Solution {
    public int lengthOfLongestSubstring(String s) {
        ArrayList<Character> list = new ArrayList<>();
        int count=0,max=0,start=0;
        for(int i =0;i<s.length();i++)
        {
            if(list.contains(s.charAt(i)))
            {
                if(count>max)
                    max=count;
                count=1;
                i = start + index(s.substring(start,i),s.charAt(i))+1;
                start = i;
                list.clear();
                list.add(s.charAt(i));
            }
            else
            {
                list.add(s.charAt(i));
                count++;
            }
        }
        if(count>max)
            max = count;
        return max;
    }
    public static int index(String s, char ch)
    {
        for(int i=0;i<s.length();i++)
            if(s.charAt(i)==ch)
                return i;
        return 1;
    }
}