class MyLinkedList {
    LinkedList<Integer> list;
    Node head = new Node();
    int len = 0;
    public MyLinkedList() {
        list = new LinkedList<>();
        head = null;
    }
    
    public int get(int index) {
        if(head == null)
            return -1;
        Node temp = head;
        while(index-->0 && temp!=null)
                temp = temp.next;
        if(temp==null)
            return -1;
        return temp.val;
    }
    
    public void addAtHead(int val) {
        if(head==null)
            head = new Node(val);
        else{
                Node temp = new Node(val);
                temp.next = head;
                head = temp;
        }
        len++;
    }
    
    public void addAtTail(int val) {
        if(head==null)
        {
            head = new Node(val);
            len++;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = new Node(val);
        len++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index>len)
            return;
        if(index==0)
        {
            addAtHead(val);
            len++;
            return;
        }
        Node cur = new Node(val);
        Node temp = head;
        Node pre = null;
        while(index-->0)
        {
            pre = temp;
            temp = temp.next;
        }
        cur.next = pre.next;
        pre.next = cur;
        len++;
    }
    
    public void deleteAtIndex(int index) {
        if(index<0 || index>=len)
            return ;
        if(index==0)
        {
            head = head.next;
            len--;
            return ;
        }
        Node temp = head;
        Node pre = null;
        while(index-->0)
        {
            pre = temp;
            temp = temp.next;
        }
        pre.next = temp.next;
        len--;
        
    }
    class Node {
        private int val;
        private Node next;
        public Node(){
            this.val = -1;
            this.next = null;
        }
        public Node(int data){
            this.val = data;
            this.next = null;
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */