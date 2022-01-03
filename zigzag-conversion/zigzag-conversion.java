class Solution {
    public String convert(String s, int numRows) {
         int i,j,k;
        int m=(numRows-1)*2,n=0;
        if(m==0)
            return s;
        StringBuilder ans = new StringBuilder();
        for(int p=0;p<numRows && p<s.length();p++)
        {
            i=m;j=n;k=p;
            ans.append(s.charAt(k));
            while(k<s.length())
            {
                k+=i;
                if(i!=0 && k<s.length())
                    ans.append(s.charAt(k));
                k+=j;
                if(j!=0 && k<s.length())
                    ans.append(s.charAt(k));
            }
            m-=2;
            n+=2;
        }
        return ans.toString();
    }
}