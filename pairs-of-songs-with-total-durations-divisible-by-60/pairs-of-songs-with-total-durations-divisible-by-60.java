class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int [] arr= new int[60];
        int i,count=0;
        for(i=0;i<time.length;i++)
        {
            int temp = time[i]%60;
            arr[temp]++;
        }
        for(i=0;i<=30;i++)
        {
            if(i!=0 && i!=30)
                count+=arr[i]*arr[60-i];
            else
                count+=(arr[i]*(arr[i]-1))/2;
        }
        return count;
    }
}