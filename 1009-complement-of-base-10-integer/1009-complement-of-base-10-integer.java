class Solution {
    public int bitwiseComplement(int n) {
        if(n==0)
            return 1;
        int base = 0,ans=0;
        while(n>0)
        {
            if((n&1)==0)
                ans+=(int)Math.pow(2,base);
            base++;
            n = n>>1;
        }
        return ans;
    }
}