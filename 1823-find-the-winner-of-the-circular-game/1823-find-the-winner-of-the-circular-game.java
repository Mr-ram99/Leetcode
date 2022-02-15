class Solution {
    public int findTheWinner(int n, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++)
            list.add(i+1);
        return winner(list,-1,k);
    }
    public static int winner(ArrayList<Integer> list, int start, int k)
    {
        if(list.size()==1)
            return list.get(0);
        if(start!=-1)
        {
            list.remove(start);
            start=(start+k-1)%(list.size());
        }
        else
            
            start=(start+k)%(list.size());
        return winner(list,start,k);
    }
}