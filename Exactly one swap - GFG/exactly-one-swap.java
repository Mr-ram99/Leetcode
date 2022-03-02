// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            String S = read.readLine().trim();
            Solution ob = new Solution();
            long ans = ob.countStrings(S); 
            System.out.println(ans);
        }
    } 
} // } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    long countStrings(String S) 
    { 
        // code here
        int [] fre = new int[26];
        long count=0;
        boolean flag = false;
        for(int i=0;i<S.length();i++)
        {
            fre[S.charAt(i)-'a']++;
            if(fre[S.charAt(i)-'a']>=2)
                flag = true;
        }
        for(int i=0;i<S.length();i++){
            fre[S.charAt(i)-'a']--;
            count += (S.length()-i-1) - fre[S.charAt(i)-'a'];
        }
        if(flag)
            return count+1;
        return count;
    }
}