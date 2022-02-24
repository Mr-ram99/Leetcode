class Solution {
    public String repeatLimitedString(String s, int repeatLimit) {
        PriorityQueue<Character> p= new PriorityQueue<Character>((a,b)->b-a);
        for(int i=0;i<s.length();i++){
            p.add(s.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        Stack<Character> stk = new Stack<>();
        int count=0;
        char pre = p.peek();
        while(!p.isEmpty()){
            char curr = p.poll();
            if(curr==pre){
                if(count<repeatLimit)
                    sb.append(curr);
                else
                    stk.add(curr);
                count++;
            }
            else{
                if(stk.isEmpty()){
        			count=0;
        			sb.append(curr);
        			pre = curr;
        			count++;
        		}
                else {
                sb.append(curr);
                count=0;
                while(!stk.isEmpty() && count<repeatLimit){
                    sb.append(stk.pop());
                    count++;
                 }
                }
            }    
        }
        return sb.toString();
    }
}