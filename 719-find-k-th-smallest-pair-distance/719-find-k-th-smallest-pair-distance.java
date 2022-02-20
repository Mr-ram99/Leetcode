class Solution {
    public int smallestDistancePair(int[] arr, int k) {
        Arrays.sort(arr);
        int n = arr.length;
        int s = 0, e = arr[n-1]-arr[0];
        while(s<e){
            int mid = (e+s)/2;
            if(check(mid,arr)>=k)
                e = mid;
            else 
                s = mid+1;
        }
        return s;
    }
    public static int check(int mid, int [] arr){
        int j=1;
        int n = arr.length;
        int total = 0;
        for(int i=0;i<n;i++){
            while(j<n && arr[j]-arr[i]<=mid) j++;
            j--;
            total += j-i;
        }
        return total;
    }
}