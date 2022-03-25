class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int n = costs.length;
        int [][] mat = new int[n][3];
        for(int i=0;i<n;i++){
            mat[i][0] = costs[i][0];
            mat[i][1] = costs[i][1];
            mat[i][2] = (int)Math.abs(costs[i][0]-costs[i][1]);
        }
        int count1=0, count2=0, sum=0;
        Arrays.sort(mat, (a,b)->a[2]<b[2]?1:-1);
        for(int i=0;i<n;i++){
            if(mat[i][0]<=mat[i][1] &&  count1<n/2){
                sum += mat[i][0];
                count1++;
            }
            else if(mat[i][1]<=mat[i][0] && count2<n/2){
                sum += mat[i][1];
                count2++;
            }
            else if(count1<n/2){
                sum += mat[i][0];
                count1++;
            }
            else{
                sum += mat[i][1];
                count2++;
            }
                
        }
        return sum;
    }
}