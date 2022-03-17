class Solution {
    public int scoreOfParentheses(String s) {
        // Stack<Integer> stk = new Stack<>();
        // stk.push(0);
        // for(char ch: s.toCharArray()){
        //     if(ch=='(')
        //         stk.push(0);
        //     else{
        //         int x = stk.pop();
        //         int y = stk.pop();
        //         stk.push(y+Math.max(2*x,1));
        //     }
        // }
        // return stk.pop();
        
        int ans=0, depth = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(')
                depth++;
            else{
                depth--;
                if(s.charAt(i-1)=='(')
                    ans += 1<<depth;
            }
        }
        return ans;
    }
}