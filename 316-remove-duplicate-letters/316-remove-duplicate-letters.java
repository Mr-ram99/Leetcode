class Solution {
    public String removeDuplicateLetters(String s) {
        boolean [] visited = new boolean[26];
        StringBuilder sb = new StringBuilder();
        Stack<Character> stk = new Stack<>();
        int [] lastIndex = new int[26];
        int i;
        for(i=0;i<s.length();i++){
            lastIndex[s.charAt(i)-'a']=i;
        }
        Arrays.fill(visited, false);
        i=0;
        while(i<s.length()){
            char ch = s.charAt(i);
            if(stk.isEmpty()){
                stk.push(ch);
                visited[ch-'a']=true;
            }
            else if(ch<stk.peek() && lastIndex[stk.peek()-'a']>i && !visited[ch-'a']){
                while(!stk.isEmpty() && ch<stk.peek() && lastIndex[stk.peek()-'a']>i){
                    visited[stk.pop()-'a']=false;
                }
                stk.push(ch);
                visited[ch-'a']=true;
            }
            else if(!visited[ch-'a']){
                stk.push(ch);
                visited[ch-'a']=true;
            }
            i++;
        }
        while(!stk.isEmpty()){
            sb.append(stk.pop());
        }
        return sb.reverse().toString();
    }
}