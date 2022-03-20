class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int a = tops[0];
        int b = bottoms[0];
        int x = check(tops,bottoms,a);
        int y = check(tops,bottoms,b);
        int z = check(bottoms,tops,a);
        int w = check(bottoms,tops,b);
        int ans = Math.min(Math.min(x,y),Math.min(z,w));
        if(ans == Integer.MAX_VALUE)
            return -1;
        return ans;
    }
    public static int check(int[]arr1,int []arr2,int p){
        int count=0;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=p){
                if(arr2[i]!=p)
                    return Integer.MAX_VALUE;
                else
                    count++;
            }
        }
        return count;
    }
}