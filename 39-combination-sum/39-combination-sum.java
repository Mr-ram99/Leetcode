class Solution {
    public List<List<Integer>> combinationSum(int[] arr, int target) {
        Arrays.sort(arr);
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> li = new ArrayList<>();
        combsum(0, arr, target, 0, list, li);
        return list;
    }
    public static void combsum(int sum, int[] arr, int target, int start, List<List<Integer>> list, List<Integer> li){
        if(sum == target)
        {
            list.add(new ArrayList<>(li));
            return ;
        }
        if(sum>target)
            return;
        for(int i=start;i<arr.length;i++){
            sum += arr[i];
            if(sum>target)
                return;
            li.add(arr[i]);
            combsum(sum, arr, target, i, list, li);
            li.remove(li.size()-1);
            sum-=arr[i];
        }
    }
}