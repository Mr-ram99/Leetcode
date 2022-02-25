class Solution {
    public int compareVersion(String version1, String version2) {
        ArrayList<String> v1 = new ArrayList<>();
        ArrayList<String> v2 = new ArrayList<>();
        int s=0,i;
        for(i=0;i<version1.length();i++){
            char ch = version1.charAt(i);
            if(Character.isDigit(ch)){
                continue;
            }
            else {
                v1.add(version1.substring(s,i));
                s=i+1;
            }
        }
        v1.add(version1.substring(s,i));
        
        // System.out.println(Arrays.toString(v1));
        s=0;
        for(i=0;i<version2.length();i++){
            char ch = version2.charAt(i);
            if(Character.isDigit(ch)){
                continue;
            }
            else {
                v2.add(version2.substring(s,i));
                s=i+1;
            }
        }
        v2.add(version2.substring(s,i));
        
        int n1=v1.size();
        int n2=v2.size();
        int [] ver1 = new int[n1];
        int [] ver2 = new int[n2];
        for(i=0;i<n1;i++){
            ver1[i] = Integer.parseInt(v1.get(i));
        }
        for(i=0;i<n2;i++){
            ver2[i] = Integer.parseInt(v2.get(i));
        }
        i=0;
        while(i<n1 && i<n2){
            if(ver1[i]>ver2[i])
                return 1;
            if(ver1[i]<ver2[i])
                return -1;
            // System.out.println(ver1[i]+" "+ver2[i]);
            i++;
        }
        while(i<n1){
            if(ver1[i]>0)
                return 1;
            i++;
        }
        while(i<n2){
            if(ver2[i]>0)
                return -1;
            i++;
        }
        return 0;
    }
}