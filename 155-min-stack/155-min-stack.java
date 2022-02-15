class MinStack {
    Node head;
    public MinStack() {
        head = null;
    }
    
    public void push(int val) {
        if(head == null)
            head = new Node(val, val, null);
        else
            head = new Node(val, Math.min(val, head.min), head);
        
    }
    
    public void pop() {
        head = head.next;
    }
    
    public int top() {
        return head.val;
    }
    
    public int getMin() {
        return head.min;
    }
    class Node{
        int val;
        int min;
        Node next;
        public Node(int v, int m, Node next){
            this.val = v;
            this.min = m;
            this.next = next;
        }
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */