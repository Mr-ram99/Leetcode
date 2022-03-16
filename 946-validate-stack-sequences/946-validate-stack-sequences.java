class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stk = new Stack<>();
        int n=pushed.length;
        int m=popped.length;
        int i=0,j=0;
        while(i<n && j<m){
            if(!stk.isEmpty() && stk.peek()==popped[j]){
                stk.pop();
                    j++;
            }
            else if(i<n)
            {
                stk.push(pushed[i]);
                i++;
            }
        }
        if(j<m)
        {
            while(j<m)
                if(!stk.isEmpty() && stk.peek()==popped[j]){
                    stk.pop();
                    j++;
                }
                else{
                    return false;
                }
        }
        return true;
    }
}