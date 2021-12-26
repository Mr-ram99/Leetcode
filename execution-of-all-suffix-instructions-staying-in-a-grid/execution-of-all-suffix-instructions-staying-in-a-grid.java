class Solution {
    public int[] executeInstructions(int n, int[] startPos, String s) {
        int len = s.length();
        int count,i=0;
        int [] res = new int[len];
        while(i<len)
        {
            count = icount(n,startPos,s.substring(i));
            res[i] = count;
            i++;
        }
        return res;
    }
    public static int icount(int n, int [] startPos, String str)
    {
        int ans=0;
        int l = str.length();
        int a,b;
        a = startPos[0];
        b = startPos[1];
        int j=0;
        while(j<l)
        {
            switch(str.charAt(j))
            {
                case 'L': b--;break;
                case 'R': b++;break;
                case 'U': a--;break;
                case 'D': a++;break;  
            }
            if(check(n,a,b))
                break;
            ans++;
            j++;
        }
        return ans;
    }
    public static boolean check(int n, int a, int b)
    {
        if(a<0 || b<0 || a>=n || b>=n)
            return true;
        return false;
    }
}