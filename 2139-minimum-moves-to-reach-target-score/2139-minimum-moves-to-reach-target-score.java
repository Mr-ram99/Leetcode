class Solution {
    public int minMoves(int target, int maxDoubles) {
        int steps=0;
        while(target!=1)
        {
            if(maxDoubles==0)
            {
                steps += target-1;
                break;
            }
            else
            {
                if(target%2==0)
                {
                    steps += 1;
                }
                else
                {
                    steps += 2;
                }
                maxDoubles--;
                target /= 2;
            }
        }
        return steps;
    }
}