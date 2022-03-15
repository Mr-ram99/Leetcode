class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
         int count=0;
        for(int num:arr1){
            for(int i=0;i<arr2.length;i++){
                if(Math.abs(num-arr2[i])<=d){
                    count++;
                    break;
                }
            }
        }
        return arr1.length-count;
    }
}