class Solution {
    public boolean backspaceCompare(String s, String t) {
        int i = s.length()-1, j = t.length()-1;
        int c1=0, c2=0;
        while(i>=0 || j>=0){
            while(i>=0)
            {
                if(s.charAt(i)=='#'){
                    c1++;i--;
                }
                else if(c1>0){
                    c1--;i--;
                }
                else break;
            }
            while(j>=0)
            {
                if(t.charAt(j)=='#'){
                    c2++;j--;
                }
                else if(c2>0){
                    c2--;j--;
                }
                else break;
            }
            if(i>=0 && j>=0 && s.charAt(i)!=t.charAt(j))
                return false;
            if(i>=0 != j>=0)
                return false;
            i--;j--;
        }
        return true;
    }
}