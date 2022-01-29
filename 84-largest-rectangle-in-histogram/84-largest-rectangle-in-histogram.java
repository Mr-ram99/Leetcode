class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
//      time - O(n) Space - O(3*n)
        int [] leftsmaller = new int[n];
        int [] rightsmaller = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++)
        {
            while(!st.isEmpty() && heights[st.peek()]>=heights[i])
                st.pop();
            if(st.isEmpty()) leftsmaller[i]=0;
            else leftsmaller[i] = st.peek() + 1;
            st.push(i);
        }
        
        while(!st.isEmpty()) st.pop();
        int max=0;
        for(int i=n-1;i>=0;i--)
        {
            while(!st.isEmpty() && heights[st.peek()]>=heights[i])
                st.pop();
            if(st.isEmpty()) rightsmaller[i]=n-1;
            else rightsmaller[i] = st.peek() - 1;
            st.push(i);
            
            max= Math.max(max,heights[i]*(rightsmaller[i]-leftsmaller[i]+1));
        }
        
        return max;
//         brute force
        // int i, j, maxarea=0, max=heights[0],count;
        // for(i=0;i<n;i++)
        // {
        //     if(heights[i]>max)
        //         max = heights[i];
        // }
        // for(i=1;i<=max;i++)
        // {
        //     count=0;
        //     for(j=0;j<n;j++)
        //     {
        //         if(heights[j]>=i)
        //             count++;
        //         else
        //             count=0;
        //         if(i*count>maxarea)
        //             maxarea = i*count;
        //     }
        // }
        // return maxarea;
    }
}