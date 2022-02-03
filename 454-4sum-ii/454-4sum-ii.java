class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int n = nums1.length;
        int i,j;
        HashMap<Integer,Integer> map = new HashMap<>();
        int count=0,sum;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                sum = nums1[i]+nums2[j];
                map.put(sum, map.getOrDefault(sum,0)+1);
            }
        }
        
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                sum = nums3[i]+nums4[j];
                count += map.getOrDefault(-sum,0);
            }
        }
        
        return count;
    }
}