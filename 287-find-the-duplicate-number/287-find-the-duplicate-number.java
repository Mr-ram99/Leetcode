class Solution {
    public int findDuplicate(int[] arr) {
        int cr  = 0;
        for(int i=0;i<arr.length;i++){
            cr = arr[i]-1;
            if(arr[cr]!=arr[i]){
                int temp = arr[cr];
                arr[cr] = arr[i];
                arr[i] = temp;
                i--;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i+1){
                return arr[i];
            }
        }
        return -1; // dummy return
    }
}