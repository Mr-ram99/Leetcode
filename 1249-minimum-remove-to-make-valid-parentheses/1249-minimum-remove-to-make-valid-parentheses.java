class Solution {
    public String minRemoveToMakeValid(String s) {
        char [] ch = s.toCharArray();
        Stack<Character> stk = new Stack<>();
        int i=0;
        while(i<ch.length){
            char c = ch[i];
            switch(c){
                case '(':   stk.push('(');break;
                case ')':   if(stk.isEmpty())
                            ch[i]='0';
                            else 
                                stk.pop();
                            break;
            }
            i++;
        }
        if(!stk.isEmpty())
        {
            int l = stk.size();
            int m=0;
            for(i=ch.length-1;i>=0 && m<l;i--){
                if(ch[i]=='(')
                {
                    ch[i]='0';
                    m++;
            }
        }
        }
         StringBuilder sb = new StringBuilder();   
        for(i=0;i<ch.length;i++){
            if(ch[i]!='0')
                sb.append(ch[i]);
        }
        return sb.toString();
    }
}