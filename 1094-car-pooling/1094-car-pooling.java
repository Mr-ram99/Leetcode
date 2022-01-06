class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int i,pass=trips[0][0];
        int min = trips[0][1],max=trips[0][1];
        for(i=0;i<trips.length;i++)
        {
            if(trips[i][1]<min)
                min = trips[i][1];
            if(trips[i][2]>max)
                max = trips[i][2];
        }
        int [] arr = new int[max+1];
        for(i=0;i<trips.length;i++)
        {
            for(int j=trips[i][1];j<trips[i][2];j++)
                {
                arr[j]+=trips[i][0];
                if(arr[j]>capacity)
                    return false;
            }
        }
        return true;
        
    }
}