// { Driver Code Starts
//Initial Template for Java

import java.util.*;
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
class insertion
{
    Node head;  
    Node tail;
	public void addToTheLast(Node node) 
	{
	  if (head == null) 
	  {
	   head = node;
	   tail = node;
	  } 
	  else 
	  {
	   tail.next = node;
	   tail = node;
	  }
	}
      void printList(Node head)
    {
        Node temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }
	/* Drier program to test above functions */
	public static void main(String args[])
    {
         Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();
		 while(t>0)
         {
			int n = sc.nextInt();
			insertion llist = new insertion(); 
			int a1=sc.nextInt();
			Node head= new Node(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < n; i++) 
			{
				int a = sc.nextInt(); 
				llist.addToTheLast(new Node(a));
			}
			
        Solution ob = new Solution();
		head = ob.insertionSort(llist.head);
		llist.printList(head);
		
        t--;		
        }
    }}// } Driver Code Ends


//User function Template for Java

/*class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
    */
class Solution
{
    public static Node insertionSort(Node head)
    {
        //code here
        if(head==null || head.next==null)
            return head;
        Node cur = head.next;
        Node pre = head;
        int i=1;
        while(cur!=null){
           Node temp = head;
           Node pretemp = null;
           int j=0;
           while(cur.data>=temp.data && j<i){
               pretemp = temp;
               temp = temp.next;
               j++;
           }
           if(i==j){
               pre = cur;
               cur = cur.next;
               i++;
               continue;
           }
           if(temp == head){
               pre.next = cur.next;
               cur.next = temp;
               head = cur;
           }
           else{
               pre.next = cur.next;
               cur.next = temp;
               pretemp.next =cur;
               cur = pre.next;
           }
           cur= pre.next;
            i++;
        }
        return head;
    }
}