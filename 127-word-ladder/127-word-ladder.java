class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> set = new HashSet<>();
        boolean endPresent = false;
        for(String s:wordList)
        {
            set.add(s);
            if(s.equals(endWord))
                endPresent = true;
        }
        if(!endPresent)
            return 0;
        
        Queue<String> q = new LinkedList<>();
        q.add(beginWord);
        int depth = 0, size = 0;
        while(!q.isEmpty()){
            depth++;
            size = q.size();
            while(size-->0){
                String cur = q.remove();
                for(int i=0;i<cur.length();i++){
                    for(char ch='a';ch<='z';ch++){
                        String temp = cur.substring(0,i)+ch+cur.substring(i+1);
                        if(temp.equals(cur))
                            continue;
                        if(temp.equals(endWord))
                            return depth+1;
                        if(set.contains(temp))
                        {
                            q.add(temp);
                            set.remove(temp);
                        }
                    }
                }
            }
        }
        return 0; 
    }
}