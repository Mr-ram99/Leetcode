class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int [] arr1 = new int[26];
        int i, j, n1=s1.length(), n2=s2.length();
        for(i=0;i<n1;i++)
            arr1[s1.charAt(i)-'a']++;
        
        for(i=0;i<=n2-n1;i++)
        {
            int [] arr2 = new int[26];
            for(j=0;j<n1;j++)
            {
                arr2[s2.charAt(j+i)-'a']++;
            }
            if(match(arr1, arr2))
                return true;
        }
        return false;
    }
    public static boolean match(int [] a1, int [] a2)
    {
        for(int i=0;i<26;i++)
        {
            if(a1[i]!=a2[i])
                return false;
        }
        return true;
    }
}