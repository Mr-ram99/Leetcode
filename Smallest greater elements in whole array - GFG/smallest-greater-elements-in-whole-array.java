// { Driver Code Starts
//Initial Template for Java

//Initial Template for Java

//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    int sizeOfArray = Integer.parseInt(br.readLine());
		    int arr [] = new int[sizeOfArray];
		    
		    String line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    for(int i = 0;i<sizeOfArray;i++){
		        arr[i] = Integer.parseInt(elements[i]);
		    }
		    
		    Complete obj = new Complete();
		    arr = obj.greaterElement(arr, sizeOfArray);
		    for(int i=0; i< sizeOfArray;i++){
		        if(arr[i] == -10000000)
		            System.out.print("_ ");
		        else
		            System.out.print(arr[i] + " ");
		    }
		    System.out.println();
		}
	}
}


// } Driver Code Ends


//User function Template for Java

//User function Template for Java

//User function Template for Java

            

class Complete{
    
   
    // Function for finding maximum and value pair
    public static int[] greaterElement (int arr[], int n) {
        // Complete the function
        int [] ans = new int[n];
        int i=0,j=0;
        for(i=0;i<n;i++){
            ans[i] = arr[i];
        }
        Arrays.sort(arr);
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(i=0;j<n;i++){
            if(i==j)
                j++;
            while(j<n && arr[i]==arr[j])
                j++;
            if(j<n)
                {
                    map.put(arr[i], arr[j]);
                }
            else break;
        }
        for(;i<n;i++){
            map.put(arr[i], -10000000);
        }
        for(i=0;i<n;i++){
            ans[i] = map.get(ans[i]);
        }
        return ans;
    }
    
    
}


