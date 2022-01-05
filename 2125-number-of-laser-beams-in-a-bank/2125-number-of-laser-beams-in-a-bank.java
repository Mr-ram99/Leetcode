class Solution {
    public int numberOfBeams(String[] bank) {
        int pre=0,beams=0;
        for(int i=0;i<bank.length;i++)
        {
            int count=0;
            for(int j=0;j<bank[i].length();j++)
                if(bank[i].charAt(j)=='1')
                    count++;
            if(count>0)
            {
                beams += pre*count;
                pre = count;
            }
        }
        return beams;
    }
}