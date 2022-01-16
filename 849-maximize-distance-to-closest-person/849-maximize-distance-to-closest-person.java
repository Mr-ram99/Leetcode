class Solution {
    public int maxDistToClosest(int[] seats) {
        int n = seats.length;
        int i=0,j=n-1;
        int maxstart=0,maxend=0,max=0,count=0;
        while(seats[i]==0)
        {
            maxstart++;
            i++;
        }
        while(seats[j]==0)
        {
            maxend++;
            j--;
        }
        while(i<=j)
        {
            if(seats[i]==0)
                count++;
            else {
                if(count>max)
                    max = count;
                count=0;
            }
            i++;
        }
        if(count>max)
            max=count;
        return Math.max(Math.max(maxstart,maxend),(max+1)/2);
    }
}