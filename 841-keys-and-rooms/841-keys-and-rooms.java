class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Stack<Integer> stk  = new Stack<>();
        boolean [] visited = new boolean[rooms.size()];
        stk.push(0);
        while(!stk.isEmpty()){
            int s = stk.pop();
            if(visited[s])
                continue;
            visited[s]=true;
            for(int n: rooms.get(s)){
                if(!visited[n])
                    stk.push(n);
            }
        }
        for(int i=0;i<visited.length;i++){
            if(!visited[i])
                return false;
        }
        return true;
    }
}