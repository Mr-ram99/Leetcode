class Solution {
    public int minimumBuckets(String street) {
        int n = street.length(), count1=0, count2=0;
        if(street.equals("H") || street.endsWith("HH") || street.startsWith("HH") || street.contains("HHH"))
            return -1;
        for(int i=0;i<n;i++)
        {
            if(street.charAt(i)=='H')
                count1++;
        }
        for(int i=0;i<n-2;i++)
        {
            if(street.substring(i,i+3).equals("H.H"))
            {
                count2++;
                i+=2;
            }
        }
        return count1-count2;
    }
}