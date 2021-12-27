class Solution {
    public long[] getDistances(int[] arr) {
        int n = arr.length;
        long [] ans = new long[n];
        int i,j;
//         Brute Force
        // for(i=0;i<n-1;i++)
        // {
        //     for(j=i+1;j<n;j++)
        //     {
        //         if(arr[i]==arr[j])
        //         {
        //             long diff = j-i;
        //             ans[i] += diff;
        //             ans[j] += diff;
        //         }
        //     }
        // }
        // return ans;
//         Prefix sum
        long [] count = new long[100001];
        long [] sum = new long[100001];
        for(i=0,j=0;i<n;i++,j++)
        {
            ans[i] += count[arr[i]]*j - sum[arr[i]];
            count[arr[i]]++;
            sum[arr[i]] +=j;
        }
        long [] count1 = new long[100001];
        long [] sum1 = new long[100001];
        for(i=n-1,j=0;i>=0;i--,j++)
        {
            ans[i] += count1[arr[i]]*j - sum1[arr[i]];
            count1[arr[i]]++;
            sum1[arr[i]] +=j;
        }
        return ans;
    }
}