class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int [][] map = new int[mat.length][2];
        int j=0;
        for(int [] a: mat){
            int count=0;
            for(int n : a){
                if(n==1)
                    count++;
                else break;
            }
            map[j][0] = j;
            map[j][1] = count;
            j++;
        }
        Arrays.sort(map, (a,b)->a[1]>b[1]?1:a[1]==b[1]?a[0]>b[0]?1:-1:-1);
        int [] ans = new int[k];
        for(int i=0;i<k;i++){
            ans[i] = map[i][0];
        }
        return ans;
    }
}