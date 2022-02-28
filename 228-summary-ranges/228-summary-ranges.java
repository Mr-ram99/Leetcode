class Solution {
    public List<String> summaryRanges(int[] nums) {
        int n=nums.length;
        int i=0,s=0;
        List<String> ans = new ArrayList<String>();
        if(n==0)
            return ans;
        while(i<n-1){
            if(nums[i]==nums[i+1]-1)
            {
                i++;
            }
            else {
                if(s==i){
                    String str = Integer.toString(nums[i]);
                    ans.add(str);
                }
                else
                {
                    String str = nums[s]+"->"+nums[i];
                    ans.add(str);
                 }
                s=i+1;
                i++;
            }
        }
        if(s==i && i<n){
            String str = Integer.toString(nums[i]);
            ans.add(str);
        }
        else
        {
            String str = nums[s]+"->"+nums[i];
            ans.add(str);
        }
        return ans;
    }
}