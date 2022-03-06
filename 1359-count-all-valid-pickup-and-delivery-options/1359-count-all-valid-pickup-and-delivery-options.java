class Solution {
    public int countOrders(int n) {
        int mod = 1000000007;
        long ans=1;
        int i=2*n;
        while(i>0){
            ans = ans*i;
            if(i%2==0)
                ans = ans/2;
            ans %= mod;
            i--;
        }
        return (int)ans;
    }
}