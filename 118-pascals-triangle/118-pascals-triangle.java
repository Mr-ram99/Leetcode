class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> li = new ArrayList<>();
        li.add(1);
        list.add(new ArrayList<>(li));
        int i=0;
        while(i<numRows-1){
            int size = li.size();
            int j=0;
            List<Integer> temp = new ArrayList<>();
            while(j<=size){
                if(j == size|| j==0){
                    temp.add(1);
                }
                else{
                    temp.add(li.get(j)+li.get(j-1));
                }
                j++;
            }
            list.add(new ArrayList<>(temp));
            li.clear();
            li = temp;
            i++;
        }
        return list;
    }
}