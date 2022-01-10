class Solution {
    public String addBinary(String a, String b) {
        int i = a.length()-1;
        int j = b.length()-1;
        int sum = 0, carry=0;
        StringBuilder sb = new StringBuilder();
        while(i>-1 && j>-1)
        {
            if((a.charAt(i)=='1' && b.charAt(j)=='0')||(a.charAt(i)=='0' && b.charAt(j)=='1'))
                sum = 1 + carry;
            else if(a.charAt(i)=='0' && b.charAt(j)=='0')
                sum = carry;
            else 
                sum = 2+carry;
            if(sum>1)
            {
                sum = sum%2;
                carry = 1;
            } 
            else
                carry = 0;
            sb.append(sum);
            i--;
            j--;
        }
        while(i>-1)
        {
            if(a.charAt(i)=='1')
                sum = 1 + carry;
            else 
                sum = carry;
            if(sum>1)
            {
                sum = sum%2;
                carry = 1;
            } 
            else
                carry = 0;
            sb.append(sum);
            i--;
        }
        while(j>-1)
        {
            if(b.charAt(j)=='1')
                sum = 1 + carry;
            else 
                sum = carry;
            if(sum>1)
            {
                sum = sum%2;
                carry = 1;
            } 
            else
                carry = 0;
            sb.append(sum);
            j--;
        }
        if(carry==1)
            sb.append(1);
        return sb.reverse().toString();
    }
}