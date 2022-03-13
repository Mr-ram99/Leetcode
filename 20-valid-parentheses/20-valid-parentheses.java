class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        int i=0;
        while(i<s.length()){
            char ch = s.charAt(i);
            if(ch=='(' || ch=='{' || ch=='[')
                stk.add(ch);
            else{
                if(stk.isEmpty())
                    return false;
                else {
                    char x = stk.peek();
                    if(x=='('){
                        if(ch!=')')
                            return false;
                    }
                    else if(x=='{'){
                        if(ch!='}')
                            return false;
                    }
                    else if(x=='['){
                        if(ch!=']')
                            return false;
                    }
                    stk.pop();
                }
            }
            i++;
        }
        if(stk.isEmpty())
                return true;
        return false;
    }
}