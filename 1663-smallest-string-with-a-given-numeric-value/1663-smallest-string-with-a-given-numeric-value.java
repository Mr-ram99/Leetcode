class Solution {
    public String getSmallestString(int n, int k) {
        StringBuilder sb = new StringBuilder();
        int exact = k%26==0 ? k/26 : k/26+1;
        
        while(n>exact){
            sb.append("a");
            n--;
            k--;
            exact = k%26==0 ? k/26 : k/26+1;
        }
        while(n>0){
            int rem = k%26==0 ? 26 : k%26;
            sb.append((char)('a'+rem-1));
            k = k - rem;
            n--;
        }
        return sb.toString();
    }
}