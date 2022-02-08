class Solution {
    public String addStrings(String num1, String num2) {
        int n1 = num1.length();
        int n2 = num2.length();
        int i=0, sum=0, carry=0, x=n1-i-1, y=n2-i-1;
        StringBuilder sb = new StringBuilder();
        while(x>=0 && y>=0)
        {
            sum = num1.charAt(x)-'0' + num2.charAt(y)-'0' + carry;
            if(sum>=10)
            {
                sum -=10;
                carry=1;
            }
            else
                carry=0;
            sb.append(sum);
            x--;
            y--;
        }
        while(x>=0)
        {
            sum = num1.charAt(x)-'0'+carry;
            if(sum>=10)
            {
                sum -=10;
                carry=1;
            }
            else
                carry=0;
            sb.append(sum);
            x--;
        }
        while(y>=0)
        {
            sum = num2.charAt(y)-'0'+carry;
            if(sum>=10)
            {
                sum -=10;
                carry=1;
            }
            else
                carry=0;
            sb.append(sum);
            y--;
        }
        if(carry==1)
            sb.append("1");
        return sb.reverse().toString();
    }
}