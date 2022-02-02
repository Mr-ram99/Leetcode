class Solution {
    public String reverseWords(String s) {
        String [] str = s.split(" ");
        int i,j;
        for(i=0;i<str.length;i++)
        {
            StringBuilder sb = new StringBuilder();
            String temp = str[i];
            for(j=temp.length()-1;j>=0;j--)
            {
                sb.append(temp.charAt(j));
            }
            str[i] = sb.toString();
        }
        String ans = "";
        for(i=0;i<str.length;i++)
        {
            if(i!=str.length-1)
            {
                ans += str[i];
                ans += " ";
            }
            else
            {
                ans += str[i];
            }
        }
        return ans;
    }
}
