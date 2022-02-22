class Solution {
    public int titleToNumber(String columnTitle) {
        int sum=0, n=columnTitle.length();
        for(int i=n-1;i>=0;i--){
            int x = columnTitle.charAt(i)-'A'+1;
            int y = (int)Math.pow(26,n-i-1)*x;
            sum += y;
        }
        return sum;
    }
}