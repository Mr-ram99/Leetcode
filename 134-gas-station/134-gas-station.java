class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int i,j;
        int n=gas.length;
//         brute force
        // for(i=0;i<n;i++)
        // {
        //     j=0;
        //     int rem=0,k=i;
        //     while(j<n)
        //     {
        //         rem += gas[k%n]-cost[k%n];
        //         if(rem<0)
        //             break;
        //         j++;
        //         k++;
        //     }
        //     if(j==n)
        //         return i;
        // }
        // return -1;
//         greedy
        int sum=0,current=0,candidate=0;
        for(i=0;i<n;i++)
        {
            sum += gas[i] - cost[i];
            current += gas[i] - cost[i];
            if(current<0)
            {
                candidate = i+1;
                current = 0 ;
            }
            
        }
        if(sum>=0)
            return candidate;
        return -1;
    }
}