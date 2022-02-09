// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            Integer arr[] = new Integer[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            
            Compute obj = new Compute();
            obj.sortBySetBitCount(arr, n);
            StringBuilder output = new StringBuilder();
            for(int i = 0; i < n; i++)
            output.append(arr[i] + " ");
            System.out.println(output);
            
        }
	}
}

// } Driver Code Ends


//User function Template for Java


class Compute  
{ 
    static void sortBySetBitCount(Integer arr[], int n)
    { 
        sort(arr,n);
    }

        static int countBits(int a)
            {
              int count = 0;
              while (a > 0)
              {
                if ((a & 1) > 0 )
                  count += 1;
                a = a >> 1;
              }
              return count;
            }
static void sort(Integer arr[],
                              int n)
            {
              Vector<Integer> []count =
                     new Vector[32];
               
              for (int i = 0;
                       i < count.length; i++)
                count[i] = new Vector<Integer>();
               
              int setbitcount = 0;
               
              for (int i = 0; i < n; i++)
              {
                setbitcount = countBits(arr[i]);
                count[setbitcount].add(arr[i]);
              }
             
              // Used as an index in
              // final sorted array
              int j = 0; 
             
              // Traverse through all bit
              // counts (Note that we sort
              // array in decreasing order)
              for (int i = 31; i >= 0; i--)
              {
                Vector<Integer> v1 = count[i];
                 
                for (int p = 0; p < v1.size(); p++)
                  arr[j++] = v1.get(p);
              }
            }
 
     
}
