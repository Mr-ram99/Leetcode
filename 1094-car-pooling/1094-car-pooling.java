class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int i;
        int [] arr = new int[1001];
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