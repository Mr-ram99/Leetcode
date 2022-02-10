class Solution {
    public List<Integer> partitionLabels(String s) {
        int [] lastOcc = new int[26];
        int st=0, e=0;
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            lastOcc[ch-'a'] = i;
        }
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(i>e)
            {
                res.add(e-st+1);
                st = i;
            }
            e = Math.max(e, lastOcc[ch-'a']);
        }
        res.add(e-st+1);
        return res;
        
    }
}