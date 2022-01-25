class Solution {
    public int fib(int n) {
        if(n==0 || n==1)
            return n;
        double Phi = Math.pow((1+Math.sqrt(5))/2,n); 
        double phi = Math.pow((1-Math.sqrt(5))/2,n);
        double res = (Phi - phi)/Math.sqrt(5);
        return (int)res;
    }
}