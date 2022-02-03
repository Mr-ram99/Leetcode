class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length, i, j;
        sort(intervals);
        int a1, b1, a2, b2;
        List<List<Integer>> ans = new ArrayList<>();
        a1 = intervals[0][0];
        b1 = intervals[0][1];
        for(i=0;i<n;i++)
        {
            a2 = intervals[i][0];
            b2 = intervals[i][1];
            if((a2>=a1 && a2<=b1) || (b2>=a1 && b2<=b1) || (a2<a1 && b2>b1))
            {
                    a1 = Math.min(a1,a2);
                    b1 = Math.max(b1,b2);
            }
            else
            {
                ans.add(new ArrayList<>(Arrays.asList(a1,b1)));
                a1 = a2;
                b1 = b2;
            }
        }
        ans.add(new ArrayList<>(Arrays.asList(a1,b1)));
        int [][] res = new int[ans.size()][2];
        i=0;
        for(List<Integer> e:ans)
        {
            res[i][0] = e.get(0);
            res[i][1] = e.get(1);
            i++;
        }
        return res;
    }
    public static void sort(int [][] arr)
    {
        int n = arr.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i][0]>arr[j][0])
                {
                    int temp1 =arr[i][0];
                    int temp2 = arr[i][1];
                    arr[i][0] = arr[j][0];
                    arr[i][1] = arr[j][1];
                    arr[j][0] = temp1;
                    arr[j][1] =temp2;
                }
            }
        }
    }
}