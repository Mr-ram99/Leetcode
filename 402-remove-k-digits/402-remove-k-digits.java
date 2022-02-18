class Solution {
    public String removeKdigits(String num, int k) {
        if(k==0)
            return num;
        if(num.length()==0)
            return num;
        Stack<Character> stk = new Stack<>();
        stk.add(num.charAt(0));
        int i=1;
        while(i<num.length() && k>0){
            if(num.charAt(i)>=num.charAt(i-1))
                stk.add(num.charAt(i));
            else {
                while(!stk.isEmpty() && num.charAt(i)<stk.peek() && k-->0)
                {
                    stk.pop();
                }
                stk.add(num.charAt(i));
            }
            i++;
        }
        while(i<num.length())
        {
            stk.add(num.charAt(i));
            i++;
        }
        while(k-->0){
            stk.pop();
        }
        char [] ch = new char[stk.size()];
        for(i=stk.size()-1;i>=0;i--)
        {
            ch[i] = stk.pop();
        }
        String ans = new String(ch);
        i=0;
        while(i<ans.length() && ans.charAt(i)=='0')
            i++;
        ans = ans.substring(i);
        if(ans.length()==0)
            ans = "0";
        return ans;
    }
}