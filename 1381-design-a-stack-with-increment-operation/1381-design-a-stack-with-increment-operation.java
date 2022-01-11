class CustomStack {
    ArrayList<Integer> stack = new ArrayList<>();
    int size = 0;
    public CustomStack(int maxSize) {
        this.size = maxSize;
    }
    
    public void push(int x) {
        if(stack.size()<size)
            stack.add(x);
    }
    
    public int pop() {
        if(!stack.isEmpty())
        {
            int temp = stack.get(stack.size()-1);
            stack.remove(stack.size()-1);
            return temp;
        }
        return -1;
            
    }
    
    public void increment(int k, int val) {
        int i =0;
        while(k-->0 && i<stack.size())
        {
            int t = stack.get(i)+val;
            stack.remove(i);
            stack.add(i,t);
            i++;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */