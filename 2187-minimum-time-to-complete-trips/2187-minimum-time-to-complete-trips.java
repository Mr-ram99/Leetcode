class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long s=0, e=(long)1e14, mid=0, ans=e;
        while(s<=e){
            mid = s + (e-s)/2;
            long trips = calculate(mid, time);
            if(trips>=totalTrips){
                e = mid-1;
                ans = mid;
            }
            else{
                s = mid+1;
            }
        }
        return ans;
    }
    public static long calculate(long mid, int [] time){
        long sum=0;
        for(int i=0;i<time.length;i++){
            sum+=(long)((long)mid/(long)time[i]);
        }
        return sum;
    }
}