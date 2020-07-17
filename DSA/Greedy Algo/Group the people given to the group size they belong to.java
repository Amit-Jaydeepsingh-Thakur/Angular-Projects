Link-https://leetcode.com/problems/group-the-people-given-the-group-size-they-belong-to/

class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) 
    {
      int i=0,j=0;
      Map<Integer,List<Integer>>map=new HashMap<>();
      List<List<Integer>>list=new ArrayList<>();
      if(groupSizes==null || groupSizes.length==0)
      {
        return(list);
      }
      for(i=0;i<groupSizes.length;i++)
      {
        if(!map.containsKey(groupSizes[i]))
        {
          map.put(groupSizes[i],new ArrayList<>());
        }
        map.get(groupSizes[i]).add(i);
      }
      for(Map.Entry<Integer,List<Integer>>e:map.entrySet())
      {
        List<Integer>ret=e.getValue();
        int no=e.getKey();
        int size=ret.size();
        if(no==size)
        {
          list.add(ret);
        }
        else
        {
          int div=size/no;
          List<Integer>out=new ArrayList<>();
          for(i=1;i<=size;i++)
          {
            if(i%no==0)
            {
              out.add(ret.get(i-1));
              list.add(new ArrayList<>(out));
              out.clear();
            }
            else
            {
              out.add(ret.get(i-1));  
            }
            
          }
        }
        
      }
      
      return(list);
        
    }
}
