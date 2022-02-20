class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0, j=0;
        while(i<nums1.length && j<nums2.length){
            if(i>0 && nums1[i]==nums1[i-1])
            {
                i++;
                continue;
            }
            if(nums1[i] == nums2[j])
            {
                set.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i] > nums2[j])
            {
                j++;
            }
            else i++;
        }
        int [] arr = new int[set.size()];
        i = 0;
        for(int n: set){
            arr[i++] = n;
        }
        return arr;
    }
}