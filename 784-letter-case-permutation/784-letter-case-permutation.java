class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> list = new ArrayList<>();
        permute("",s,list);
        return list;
    }
    public static void permute(String p, String s, List<String> list)
    {
        int i=0;
        if(s.length()==0)
        {
            list.add(p);
            return;
        }
        char ch = s.charAt(0);
        if(Character.isDigit(ch))
            permute(p+ch,s.substring(1),list);
        else
        {
            permute(p+Character.toLowerCase(ch),s.substring(1),list);
            permute(p+Character.toUpperCase(ch),s.substring(1),list);
        }
    }
}