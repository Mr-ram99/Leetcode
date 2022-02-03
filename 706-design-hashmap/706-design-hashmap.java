class MyHashMap {
    List<List<Integer>> list;
    public MyHashMap() {
        list = new ArrayList<>();
    }
    
    public void put(int key, int value) {
        boolean flag = true;
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i).get(0)==key)
            {
                list.add(i,new ArrayList<>(Arrays.asList(key,value)));
                list.remove(i+1);
                flag = false;
                break;
            }
        }
        if(flag)
        {
            List<Integer> li = new ArrayList<>();
            li.add(key);
            li.add(value);
            list.add(new ArrayList<>(li));
        }
    }
    
    public int get(int key) {
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i).get(0)==key)
            {
                return list.get(i).get(1);
            }
        }
        return -1;
    }
    
    public void remove(int key) {
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i).get(0)==key)
            {
                list.remove(i);
                break;
            }
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */