// { Driver Code Starts
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            Solution obj = new Solution();
            System.out.println(obj.reverse(sc.next()));
        }
	}
}
// } Driver Code Ends


class Solution {
    
    public String reverse(String S){
        //code here
        Stack<Character> stk = new Stack<>();
        int i=0;
        while(i<S.length())
            {
                stk.add(S.charAt(i++));
            }
        char [] chars = new char[S.length()];
        i=0;
        while(!stk.isEmpty()){
            chars[i++] = stk.pop();
        }
        return new String(chars);
    }

}