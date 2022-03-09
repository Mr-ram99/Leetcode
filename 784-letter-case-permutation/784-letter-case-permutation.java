class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> list = new ArrayList<>();
        permute("", s, 0, list);
        return list;
    }
    public static void permute(String p, String s, int i, List<String> list){
        
        while(i<s.length() && Character.isDigit(s.charAt(i))){
            p += s.charAt(i);
            i++;
        }
        if(p.length()==s.length())
        {
            list.add(p);
            return;
        }
        
        if(65<=s.charAt(i) && s.charAt(i)<=90){
            char ch = s.charAt(i);
            char ch1 = (char)(ch+32);
            permute(p+ch, s, i+1, list);
            permute(p+ch1, s, i+1, list);
        }
         else {
            char ch = s.charAt(i);
            char ch1 = (char)(ch-32);
            permute(p+ch, s, i+1, list);
            permute(p+ch1, s, i+1, list);
         } 
    } 
}