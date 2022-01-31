// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}
// } Driver Code Ends




class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        // code here 
        ArrayList<String> list = new ArrayList<>();
        String str="";
        for(int i=0;i<S.length();i++)
        {
            if(S.charAt(i)=='.' || i==S.length()-1)
                {
                    if(i==S.length()-1)
                    {
                        str += S.charAt(i);
                        list.add(str);
                    }
                    else
                    {
                        list.add(str);
                    }
                    str ="";
                }
            else
                str += S.charAt(i);
        }
        String res = "";
        for(int i=list.size()-1;i>=0;i--)
        {
            if(i!=0 && list.get(i)!="")
            {
                res += list.get(i);
                res += ".";
            }
            else if(list.get(i)!="")
                res += list.get(i);
        }
        return res;
    }
}