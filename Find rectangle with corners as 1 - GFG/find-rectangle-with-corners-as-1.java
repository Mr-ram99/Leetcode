// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.util.HashMap; 
import java.util.HashSet; 

class GFG{
	public static void main(String args[]) throws IOException { 
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t > 0){
       		int rows=sc.nextInt();
       		int columns=sc.nextInt();
			
			int matrix[][]=new int[rows][columns];
          
        	for(int i=0; i<rows;i++){            
            	for(int j=0; j<columns;j++){
                	matrix[i][j]=sc.nextInt();
            	}
         	}

			Solution x = new Solution();
			if (x.ValidCorner(matrix)) 
				System.out.println("Yes"); 
			else
				System.out.println("No"); 
			t--;
		}
	} 
}
	


// } Driver Code Ends


//User function Template for Java

public class Solution { 
	static boolean ValidCorner(int matrix[][]) 
	{ 
	    // Your code goes here
	    int r = matrix.length;
	    int c = matrix[0].length;
	    for(int i=0;i<r;i++){
	        for(int j=0;j<c;j++){
	            if(matrix[i][j]==1){
	                for(int k=j+1;k<c;k++)
	                {
	                    
	                    if(matrix[i][k]==1){
	                        for(int l=i+1;l<r;l++){
	                            if(matrix[l][j]==1 && matrix[l][k]==1)
	                                return true;
	                            
	                        }
	                    }
	                }
	            }
	        }
	    }
	    return false;
	}
}