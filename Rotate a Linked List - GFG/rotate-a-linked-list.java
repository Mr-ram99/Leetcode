// { Driver Code Starts
import java.util.*;
class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
} 

class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            
            int a = sc.nextInt();
            Node head = new Node(a);
            Node tail = head;
            
            for (int i=0; i<n-1; i++)
            {
                a = sc.nextInt();
                tail.next = new Node(a);
                tail = tail.next;
            }
            
            int k = sc.nextInt();
            
            Solution ob = new Solution();
            head = ob.rotate(head,k);
            printList(head);
        }
    }
    
    public static void printList(Node n) {
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println();
    }
}
// } Driver Code Ends


/* node of linked list:

class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}

*/

class Solution{
    //Function to rotate a linked list.
    public Node rotate(Node head, int k) {
        // add code here
        if(head == null || head.next == null)
            return head;
        Node temp = head;
        while(k-->1){
            temp = temp.next;
        }
        Node mid = temp.next;
        if(mid == null)
            return head;
        temp.next =  null;
        head = reverse(head);
        mid = reverse(mid);
        temp = head;
        while(temp.next!=null)
            temp = temp.next;
        temp.next = mid;
        return reverse(head);
    }
    public static Node reverse(Node node){
        if(node == null || node.next == null)
            return node;
        Node pre = null;
        Node cur = node;
        Node nxt = node.next;
        while(nxt!=null){
            cur.next = pre;
            pre = cur;
            cur = nxt;
            nxt = nxt.next;
        }
        cur.next = pre;
        return cur;
    }
    
    
    
    
    
    
}
