Link-https://leetcode.com/explore/featured/card/august-leetcoding-challenge/549/week-1-august-1st-august-7th/3410/

class MyHashSet 
{
  Map<Integer,Boolean>map;

    /** Initialize your data structure here. */
    public MyHashSet() 
    {
      map=new HashMap<>();        
    }
    
    public void add(int key) 
    {
      
      if(!map.containsKey(key))
      {
        map.put(key,true);
      }
    }
    
    public void remove(int key) 
    {
      
      if(map.containsKey(key))
      {
        map.remove(key);
      }
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) 
    {
      
      if(!map.containsKey(key))
      {
        return(false);
      }
      else
      {
        return(map.get(key));
      }
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
