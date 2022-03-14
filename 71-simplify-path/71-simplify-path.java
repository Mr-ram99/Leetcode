class Solution {
    public String simplifyPath(String path) {
        Stack<Character> stk = new Stack<>();
        StringBuilder ans = new StringBuilder();
        int i=0, n=path.length();
        if(n==0)
            return "";
        while(i<n){
            char ch = path.charAt(i);
            if(ch=='/'){
                if(stk.isEmpty() || stk.peek()!='/')
                    stk.push('/');
            }
            else if(ch=='.'){
                int count=0;
                while(i<n && path.charAt(i)=='.')
                {
                    count++;
                    i++;
                }
                if(i<n && path.charAt(i)!='/' || stk.peek()!='/'){
                    while(count-->0)
                        stk.push('.');
                }
                else if(count==2){
                    int c=2;
                    while(!stk.isEmpty() && c>0)
                    {
                        if(stk.pop()=='/')
                            c--;
                    }
                }
                else if(count!=1){
                    while(count-->0)
                        stk.push('.');
                }
                i--;
            }
            else{
                stk.push(ch);
            }
            i++;
        }
        if(!stk.isEmpty() && stk.peek()=='/')
            stk.pop();
        if(stk.isEmpty())
            stk.push('/');
        while(!stk.isEmpty()){
            ans.append(stk.pop());
        }
        return ans.reverse().toString();
    }
}