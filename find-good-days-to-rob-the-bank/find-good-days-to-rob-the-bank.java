class Solution {
    public List<Integer> goodDaysToRobBank(int[] security, int time) {
        List<Integer> list = new ArrayList<>();
        int i,j;
        int n = security.length;
//         brute force
    //     int start = time;
    //     while(start<n-time)
    //     {
    //         boolean left = check(security,start-time,start,0);
    //         boolean right = check(security,start,start+time,1);
    //         if(left && right)
    //             list.add(start);
    //         start++;
    //     }
    //     return list;
    // }
    // public static boolean check(int[] arr, int l, int r, int type)
    // {
    //     if(type==0)
    //     {
    //         for(int i=l;i<r;i++)
    //         {
    //             if(i<arr.length-1 && arr[i]<arr[i+1])
    //                 return false;
    //         }
    //         return true;
    //     }
    //     else
    //     {
    //         for(int i=l;i<r;i++)
    //         {
    //             if(i<arr.length-1 && arr[i]>arr[i+1])
    //                 return false;
    //         }
    //         return true;
    //     }
// Prefix sum
        int [] nonincrease = new int[n];
        int [] nondecrease = new int[n];
        for(i=1;i<n-1;i++)
        {
            if(security[i]<=security[i-1])
                nonincrease[i] = nonincrease[i-1]+1;
            else
                nonincrease[i] = 0;
        }
        for(i=n-2;i>0;i--)
        {
            if(security[i]<=security[i+1])
                nondecrease[i] = nondecrease[i+1]+1;
            else
                nondecrease[i] = 0;
        }
        for(i=0;i<n;i++)
        {
            if(nonincrease[i]>=time && nondecrease[i]>=time)
                list.add(i);
        }
        return list;
    }
}