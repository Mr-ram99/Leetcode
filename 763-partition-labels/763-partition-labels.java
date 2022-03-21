class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> list = new ArrayList<>();
        int n=s.length();
        int [] start = new int[26];
        int [] end = new int[26];
        Arrays.fill(start,-1);
        Arrays.fill(end,-1);
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(start[ch-'a']!=-1)
                start[ch-'a']=i;
        }
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            end[ch-'a']=i;
        }
        int st=0, e=end[s.charAt(0)-'a'];
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(e==i){
                list.add(e-st+1);
                st=i+1;
                if(i+1<n)
                    e = end[s.charAt(i+1)-'a'];
            }
            else if(end[ch-'a']>e){
                e = end[ch-'a'];
            }
        }
        return list;
    }
}