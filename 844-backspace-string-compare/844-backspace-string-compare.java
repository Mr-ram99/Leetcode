class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stk1 = new Stack<>();
        Stack<Character> stk2 = new Stack<>();
        int i=0;
        while(i<s.length()){
            if(!stk1.isEmpty() && s.charAt(i)=='#')
                stk1.pop();
            else if(s.charAt(i)!='#')
                stk1.add(s.charAt(i));
            i++;
        }
        i=0;
        while(i<t.length()){
            if(!stk2.isEmpty() && t.charAt(i)=='#')
                stk2.pop();
            else if(t.charAt(i)!='#')
                stk2.add(t.charAt(i));
            i++;
        }
        if(stk1.size()!=stk2.size())
            return false;
        while(!stk1.isEmpty()){
            if(stk1.pop()!=stk2.pop())
                return false;
        }
        return true;
    }
}