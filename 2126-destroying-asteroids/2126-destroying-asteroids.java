class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long m = mass;
        for(int a:asteroids)
        {
            if(a<=m)
                m+=a;
            else
                return false;
        }
        return true;
    }
    
}