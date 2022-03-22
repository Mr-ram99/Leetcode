class Solution {
    public int countCollisions(String dir) {
        int res=0, right=0, n = dir.length(), i=0;
        while(i<n && dir.charAt(i)=='L') i++;
        for(;i<n;i++){
            if(dir.charAt(i)=='R') right++;
            else {
                res += dir.charAt(i)=='S'?right:right+1;
                right = 0;
            }
        }
        return res;
    }
}