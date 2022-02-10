class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        List<List<String>> list = new ArrayList<>();
        String [] st = new String[n];
        boolean [] b = new boolean[n];
        for(int i=0;i<n;i++)
        {
            char [] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            st[i] = new String(ch);
        }
        for(int i=0;i<n;i++)
        {
            if(!b[i])
            {
                List<String> li = new ArrayList<>();
                li.add(strs[i]);
                b[i] = true;
                for(int j=i+1;j<n;j++)
                {
                    if(!b[j] && st[i].equals(st[j]))
                    {
                        li.add(strs[j]);
                        b[j] = true;
                    }
                }
                list.add(li);
            }
        }
        return list;
    }
    
}