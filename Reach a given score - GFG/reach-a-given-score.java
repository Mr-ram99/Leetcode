// { Driver Code Starts
// Driver Code
import static java.lang.System.out;
import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (int T = in.nextInt(); T-->0;) {
            int n = in.nextInt();
            
            Geeks obj = new Geeks();
            out.println(obj.count(n));
        }
    }
}// } Driver Code Ends


// Complete this function!

class Geeks {
    public long count(int n) {
        // Add your code here.
        long count =0 ;
        for(int i=0;i<=n/10;i++)
        {
            for(int j=0;j<=n/5;j++)
            {
                if((n-10*i-5*j)>=0 && (n-10*i-5*j)%3==0)
                    count++;
            }
        }
        
        return count;
    }
}