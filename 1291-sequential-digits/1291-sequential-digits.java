class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        int lowdigits = (int)Math.log10(low)+1;
        int highdigits = (int)Math.log10(high)+1;
        List<Integer> list = new ArrayList<>();
        int i=0;
        String s = "123456789";
        String str;
        while(lowdigits<=highdigits)
        {
            for(int j=0;j<10-lowdigits;j++)
            {
                if(j+lowdigits<10)
                    str = s.substring(j,j+lowdigits);
                else
                    str = s.substring(j);
                int add = Integer.parseInt(str);
                if(add>=low && add<=high)
                    list.add(add);
            }
            lowdigits++;
        }
        return list;
    }
}