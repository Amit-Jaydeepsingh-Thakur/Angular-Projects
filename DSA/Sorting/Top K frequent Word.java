Link-https://leetcode.com/problems/top-k-frequent-words/submissions/

class Solution {
    public List<String> topKFrequent(String[] words, int k) 
    {
      int i=0,j=0;
      Map<String,Integer>map=new LinkedHashMap<>();
      List<String>list=new ArrayList<>();
      PriorityQueue<Pair<Integer,String>>pq=new PriorityQueue<>((a,b)->
                                                                {
                                                                  if(a.getKey()==b.getKey())
                                                                  {
                                                                    int ret=a.getValue().compareTo(b.getValue());
                                                                    //System.out.println(ret);
                                                                   return(ret);
                                                                    
                                                                  }
                                                                  else
                                                                  {
                                                                    return(b.getKey()-a.getKey());
                                                                  }
                                                                });
      if(words==null || words.length==0 || k==0)
      {
        return(list);
      }
      for(i=0;i<words.length;i++)
      {
        if(!map.containsKey(words[i]))
        {
          map.put(words[i],0);
        }
        map.put(words[i],map.get(words[i])+1);
      }
      for(Map.Entry<String,Integer>e:map.entrySet())
      {
        //Pair<Integer,String>p=new Pair<>();
        pq.add(new Pair<Integer,String>(e.getValue(),e.getKey()));
        //System.out.println(e.getKey()+" "+e.getValue());
      }
      System.out.println(pq.size());
      while(!pq.isEmpty() && k!=0)
      {
        Pair<Integer,String>p=pq.poll();
        System.out.println(p.getKey()+" "+p.getValue());
        list.add(p.getValue());
        k--;
      }
      return(list); 
    }
}
