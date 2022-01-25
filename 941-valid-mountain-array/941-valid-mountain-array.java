class Solution {
    public boolean validMountainArray(int[] arr) {
        int n=arr.length;
        int i;
        if(n<3)
            return false;
        int j = findpeak(arr);
        if(j==-1)
            return false;
        for(i=0;i<j;i++)
        {
            if(arr[i]>=arr[i+1])
                return false;
        }
        for(i=j;i<n-1;i++)
        {
            if(arr[i]<=arr[i+1])
                return false;
        }
        return true;
    }
    public static int findpeak(int [] arr)
    {
        for(int i=1;i<arr.length-1;i++)
        {
            if(arr[i-1]<arr[i] && arr[i]>arr[i+1])
                return i;
        }
        return -1;
    }
}