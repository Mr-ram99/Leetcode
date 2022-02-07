// { Driver Code Starts
import java.util.*;

class Sorted_Array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            GfG obj = new GfG();
            System.out.println(obj.transitionPoint(arr, n));
            T--;
        }
    }
}// } Driver Code Ends


class GfG {
    int transitionPoint(int arr[], int n) {
        // code here
        int s = 0, e=n-1;
        while(s<=e)
        {
            int mid = s+ (e-s)/2;
            if(arr[mid]==1)
                    e=mid-1;
            
            else
                s = mid+1;
        }
        if(e<0)
            return 0;
        if(s>=n)
            return -1;
        return s;
            
    }
}