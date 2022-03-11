class Solution {
    public int minimumSum(int num) {
        int [] d = new int[4];
        int i=0;
        while(num!=0){
            d[i] = num%10;
            num/=10;
            i++;
        }
        Arrays.sort(d);
        return d[0]*10+d[2]+d[1]*10+d[3];
    }
}