class Solution {
    public int climbStairs(int n) {
        if(n==1 || n==2)
            return n;
        double phi = (1+Math.sqrt(5))/2;
        double PHI = (1-Math.sqrt(5))/2;
        return (int)((Math.pow(phi,n+1)-Math.pow(PHI,n+1))/Math.sqrt(5));
    }
}