class Solution {
    public boolean isSubsequence(String s, String t) {
        int n = s.length();
        int m = t.length();
        if(n==0)
            return true;
        int i=0, j=0;
        while(i<m){
            if(s.charAt(j)==t.charAt(i))
                j++;
            if(j==n)
                return true;
            i++;
        }
        return false;
    }
}