class Solution {
    public int calculate(String s) {
        char ch, ops='+';
        int curNum = 0;
        Stack<Integer> stk = new Stack<>();
        int i=0, n=s.length();
        while(i<n)
        {
            ch = s.charAt(i);
            if(Character.isDigit(ch))
                    curNum = curNum*10 + (ch - '0');
            if(!Character.isDigit(ch) && !Character.isWhitespace(ch) || i==n-1)
            {
                switch(ops)
                {
                    case '+' : stk.push(curNum); break;
                    case '-' : stk.push(-curNum); break;
                    case '*' : stk.push(stk.pop()*curNum);break;
                    case '/' : stk.push(stk.pop()/curNum);break;
                }
                ops = ch;
                curNum =0;
            }
            i++;
        }
        int res=0;
        while(!stk.isEmpty())
            res += stk.pop();
        return res;
    }
}