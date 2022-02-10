class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0"))
            return "0";
        int n1 = num1.length();
        int n2 = num2.length();
        String str1 = n1<=n2?num1:num2;
        String str2 = n2<n1?num1:num2;
        n1 = str1.length();
        n2 = str2.length();
        int product = 0, sum =0, carry = 0, max =0 ;
        List<String> res = new ArrayList<>();
        for(int i=n1-1;i>=0;i--)
        {
            carry = 0;
            int x = str1.charAt(i)-'0';
            StringBuilder sb = new StringBuilder();
            
            for(int k=0;k<n1-i-1;k++)
            {
                sb.append("0");
            }
            
            for(int j=n2-1;j>=0;j--)
            {
                int y = str2.charAt(j)-'0';
                product = x*y + carry;
                if(product>=10)
                {
                    carry = product/10;
                    product = product%10;
                }
                else
                    carry = 0;
                sb.append(product);
            }
            if(carry>0)
                sb.append(carry);
            String ans = sb.toString();
            if(ans.length()>max)
                max = ans.length();
            res.add(ans);
        }
        carry=0;
        StringBuilder finalAns = new StringBuilder();
        for(int i=0;i<max;i++)
        {
            sum = 0;
            for(int j=0;j<res.size();j++)
            {
                if(i<res.get(j).length())
                {
                    sum  += res.get(j).charAt(i)-'0';
                }
            }
            sum += carry;
            if(sum>=10)
            {
                carry = sum/10;
                sum = sum%10;
            }
            else 
                carry=0;
            finalAns.append(sum);
        }
        if(carry>0)
            finalAns.append(carry);
        return finalAns.reverse().toString();
    }
}