class Solution {
    public int brokenCalc(int startValue, int target) {
        if(startValue == target)
            return 0;
        int count=0;
        while(startValue<target){
            target = target%2==0 ? target/2 : target+1;
            count++;
        }
        count += startValue - target;
        return count;
    }
}