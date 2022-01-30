class Solution {
    public List<Integer> maxScoreIndices(int[] nums) {
        int n = nums.length;
        int [] left = new int[n+1];
        int [] right = new int[n+1];
        List<Integer> list = new ArrayList<>();
        int count=0, max=0;
        for(int i=0;i<=n;i++)
        {
            left[i]=count;
            if(i<n && nums[i]==0)
                count++;
        }
        count=0;
        for(int i=n;i>=0;i--)
        {
            if(i<n && nums[i]==1)
                count++;
             right[i]=count;
            if(right[i]+left[i]>max)
                max=right[i]+left[i];
        }
        for(int i=0;i<=n;i++)
        {
            if(left[i]+right[i]==max)
                list.add(i);
        }
        return list;
    }
}