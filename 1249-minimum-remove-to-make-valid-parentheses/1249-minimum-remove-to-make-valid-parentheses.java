class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Character> stk = new Stack<>();
        int i=0, n=s.length();
        int count=0;
        while(i<n){
            char ch = s.charAt(i);
            if(ch=='('){
                count++;
                stk.push(ch);
            }
            else if(ch==')'){
                count--;
                if(count>=0)
                    stk.push(ch);
                else
                    count++;
            }
            else{
                stk.push(ch);
            }
            i++;
        }
        StringBuilder sb = new StringBuilder();
        if(count>0){
            while(count>0 && !stk.isEmpty()){
            char ch = stk.pop();
            if(ch!='(')
                sb.append(ch);
            else
                count--;
            }
            while(!stk.isEmpty()){
                sb.append(stk.pop());
            }
        }
        else{
            while(!stk.isEmpty()){
                sb.append(stk.pop());
            }
        }
        return sb.reverse().toString();
    }
}