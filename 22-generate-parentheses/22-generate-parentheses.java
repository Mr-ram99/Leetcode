class Solution {
    public List<String> generateParenthesis(int n) {
        String s ="";
        List<String> list = new ArrayList<>();
        int co = 0, cc = 0, max=n;
        generate(s, list, co, cc, max);
        return list;
    }
    public static void generate(String s, List<String> list, int co, int cc, int max)
    {
        if(s.length()==max*2)
        {
                list.add(s);
            return ;
        }
        if(co<max)
        {
            generate(s+"(", list, co+1, cc, max);
        }
        if(cc<co)
        {
            generate(s+")", list, co, cc+1, max);
        }
    }
}







