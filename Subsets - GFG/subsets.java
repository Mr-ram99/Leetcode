// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		for(int t=0;t<testCases;t++){
		    int n = sc.nextInt();
		    int arr[] = new int[n];
		    ArrayList<Integer> A = new ArrayList<Integer>();
		    for(int i=0;i<n;i++){
		        arr[i] = sc.nextInt();
		        A.add(arr[i]);
		        
		    }
		   
		   
		    
		    ArrayList <ArrayList<Integer>> res = new Solution().subsets(A);
		    for (int i = 0; i < res.size (); i++)
		    {
		        for (int j = 0; j < res.get(i).size (); j++)
		        {
		          System.out.print(res.get(i).get(j)+" ");
		        }
		        System.out.println();
		      
		    }
		    //System.out.println();
		}
	}
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    public static ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A)
    {
        //code here
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> li = new ArrayList<>();
        printAll(A, list, li, 0);
        Collections.sort(list, new Comparator<ArrayList<Integer>>(){
           @Override
           public int compare(ArrayList<Integer> a,ArrayList<Integer> b){
               for(int i=0;i<Math.min(a.size(),b.size());i++){
                   if(a.get(i)!=b.get(i))
                   return a.get(i)-b.get(i);
               }
               return a.size()-b.size();
           }
       });
        return list;
    }
    public static void printAll(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> list, ArrayList<Integer> li, int i){
        if(i==arr.size()){
            list.add(new ArrayList<>(li));
            return ;
        }
        printAll(arr,list,li,i+1);
        li.add(arr.get(i));
        printAll(arr,list,li,i+1);
        li.remove(li.size()-1);
    }
}