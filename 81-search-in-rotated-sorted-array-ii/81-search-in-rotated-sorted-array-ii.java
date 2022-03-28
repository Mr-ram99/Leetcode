class Solution {
    public boolean search(int[] nums, int target) {
        int s=0, e=nums.length-1;
        while(s<=e){
            int mid = s + (e-s)/2;
            if(nums[mid]==target)
                return true;
             if(nums[mid] > nums[s]){
                
                if(target < nums[mid] && target >= nums[s]) e = mid;
                
                else s = mid +1;
            }
            
            else if(nums[mid] < nums[s]){
                
                if(target > nums[mid] && target < nums[s]) s = mid + 1;
                
                else e = mid;
            }
            else s++;
        }
        return false;
    }
}