// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    ArrayList<Integer> arr = new ArrayList<Integer>();
                    ArrayList<Integer> res = new ArrayList<Integer>();
                    for(int i=0; i<n; i++)
                        {
                            int x = sc.nextInt();
                            arr.add(x);
                        }
                    int k = sc.nextInt();
                    
                    Solution obj = new Solution();
                    res = obj.TopK(arr,k);
                    
                    for(int i=0; i<res.size();i++)
                        {
                            System.out.print(res.get(i) + " ");
                        }
                    System.out.println();    
                    
                        
                }
        }
}// } Driver Code Ends


class Solution
{
    ArrayList<Integer> TopK(ArrayList<Integer> array, int k)
    {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> res = new ArrayList<>();
        for(int a : array)
        {
            map.put(a, map.getOrDefault(a,0)+1);
        }
        Set<Map.Entry<Integer, Integer>> set = map.entrySet();
       List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer, Integer>>(set);
       Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
           public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                       if(o2.getValue().compareTo(o1.getValue())==0){
                           return o2.getKey().compareTo(o1.getKey());
                       }
               return o2.getValue().compareTo(o1.getValue());
           }
       });
        int i=0;
        for(i=0;i<k;i++)
        {
            res.add(list.get(i).getKey());
        }
        return res;
    }
}
