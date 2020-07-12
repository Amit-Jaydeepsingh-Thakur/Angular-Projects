Link-https://leetcode.com/problems/reorganize-string/submissions/

class Solution {
    public String reorganizeString(String S) 
    {
      if(S.length()==0 || S==null)
      {
        return("");
      }
      int i=0,j=0;
      Map<Character,Integer>map=new HashMap<>();
      for(char ch:S.toCharArray())
      {
        map.put(ch,map.getOrDefault(ch,0)+1);
      }
      
      PriorityQueue<Character>pq=new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
      pq.addAll(map.keySet());
      
      StringBuilder sb=new StringBuilder();
      while(pq.size()>1)
      {
        char first=pq.remove();
        char sec=pq.remove();
        sb.append(first);
        sb.append(sec);
        map.put(first,map.get(first)-1);
        map.put(sec,map.get(sec)-1);
        if(map.get(first)>0)
        {
          pq.add(first);
        }
        if(map.get(sec)>0)
        {
          pq.add(sec);
        }
      }
      if(!pq.isEmpty())
      {
        char ch=pq.remove();
        if(map.get(ch)>1)
        {
          return("");
        }
        sb.append(ch);
      }
      return(sb.toString());
    }
}
