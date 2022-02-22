class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        int l = edges.size();
        HashSet<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<l;i++){
            set.add(edges.get(i).get(1));
        }
        for(int i=0;i<n;i++){
            if(!set.contains(i))
                list.add(i);
        }
        return list;
    }
}