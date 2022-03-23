// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Node
{
    int data;
    Node next;
    
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}

class LinkedList
{
    static  Node head;  
    static  Node lastNode;
    
    public static void addToTheLast(Node node)
    {

        if (head == null)
        {
            head = node;
            lastNode = node;
        }
        else
        {
            Node temp = head;
            lastNode.next = node;
            lastNode = node;
        }
    }
    
    public static void main(String args[])
    {
        Scanner sc=  new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n, K;
            n = sc.nextInt();
            K = sc.nextInt();
            
            Node head = null;
            int val = sc.nextInt();
            head = new Node(val);
            addToTheLast(head);
            
            for(int i = 1; i< n; i++)
            {
                val = sc.nextInt();
                addToTheLast(new Node(val));
            }
            
            Node before[] = new Node[n];
            addressstore(before, head);
            GFG obj = new GFG();
            
            head = obj.swapkthnode(head, n, K);
        
           Node after[] = new Node[n];
          addressstore(after, head);
        
        if(check(before, after, n, K) == true)
            System.out.println("1");
        else
            System.out.println("0");
        
        }
    }
    
    static boolean check(Node before[], Node after[], int num, int K)
    {
          if(K > num)
           return true;
           
           return (before[K-1] == after[num - K]) && (before[num-K] == after[K-1]);
              
       
    }
    
    static void addressstore(Node arr[], Node head)
  {
      Node temp = head;
      int i = 0;
      while(temp != null){
        arr[i] = temp;
        i++;
        temp = temp.next;
    }
}
    
}// } Driver Code Ends


//User function Template for Java


/* Linked List Node class
   class Node  {
     int data;
     Node next;
     Node(int data)
     {
         this.data = data;
         next = null;
     }
  }
*/
class GFG
{
    //Function to swap Kth node from beginning and end in a linked list.
    Node swapkthnode(Node head, int num, int k)
    {
        // your code here
        if(num-k+1>0)
            k = (int)(Math.min(k, num-k+1));
        if(num==1 || k>num || num%2!=0 && k==num/2 + 1){
            return head;
        }
        else if(k==1){
            Node pre = null;
            Node temp = head;
            while(temp.next!=null){
                pre = temp;
                temp = temp.next;
            }
            if(num==2){
                temp.next = pre;
                head = temp;
            }
            else{
                Node temp2 = head.next;
                temp.next = temp2;
                pre.next = head;
                head.next = null;
                head = temp;
            }
        }
        else {
                Node pre = null;
                Node cur = head;
                Node nxt = head.next;
                
            if(num%2==0 && k == num/2){
                while(k-->1){
                    pre = cur;
                    cur = nxt;
                    nxt = nxt.next; 
                }
                pre.next = nxt;
                cur.next = nxt.next;
                nxt.next = cur;
            }
            else if(num%2!=0 && k== num/2) {
                while(k-->1){
                     pre = cur;
                    cur = nxt;
                    nxt = nxt.next;
                }
                Node node2 = nxt.next;
                Node nxt2 = node2.next;
                pre.next = node2;
                node2.next = nxt;
                nxt.next = cur;
                cur.next = nxt2;
            }
            else{
                Node pre2 = null;
                Node cur2 = head;
                Node nxt2 = head.next;
                int x = num-k+1;
                while(k-->1){
                     pre = cur;
                    cur = nxt;
                    nxt = nxt.next;
                }
                while(x-->1){
                     pre2 = cur2;
                    cur2 = nxt2;
                    nxt2 = nxt2.next;
                }
                pre.next = cur2;
                cur2.next = nxt;
                pre2.next = cur;
                cur.next = nxt2;
            }
        }
        return head;
    }
}
