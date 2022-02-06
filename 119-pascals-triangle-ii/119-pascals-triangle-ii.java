class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        for(int i=1;i<=rowIndex;i++)
        {
            List<Integer> temp = new ArrayList<>();
            for(int j=0;j<=i;j++)
            {
                if(j==0 || j==i)
                    temp.add(1);
                else
                    temp.add(list.get(j-1)+list.get(j));
            }
            list = new ArrayList<>(temp);
        }
        return list;
    }
}