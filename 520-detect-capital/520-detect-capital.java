class Solution {
    public boolean detectCapitalUse(String word) {
        int n = word.length();
        if(n==1)
            return true;
        int countCapital=0;
        for(int i=0;i<n;i++)
        {
            if(Character.isUpperCase(word.charAt(i)))
                countCapital++;
        }
        if(countCapital==0 || countCapital==n)
            return true;
        if(countCapital==1 && Character.isUpperCase(word.charAt(0)))
            return true;
        return false;
    }
}