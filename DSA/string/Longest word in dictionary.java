Link-https://leetcode.com/problems/longest-word-in-dictionary/submissions/

class Solution {
    public String longestWord(String[] words) 
    {
      int i=0,j=0,flag=0,size=0;
      Map<Character,List<String>>map=new HashMap<>();
      Set<String>set=new HashSet<>();
      PriorityQueue<String>pq=new PriorityQueue<>((a,b)->{
        if(a.length()==b.length())
        {
          return(a.compareTo(b));
        }
        else
        {
          return(b.length()-a.length());
        }
      });
      String ret="";
      for(String s:words)
      {
        set.add(s);
        pq.add(s);
      }
      while(!pq.isEmpty())
      {
        ret=pq.poll();
        for(i=0;i<ret.length();i++)
        {
          if(set.contains(ret.substring(0,i+1)))
          {
            continue;
          }
          else
          {
            //p=1;
            break;
          }
          //if(p)
        }
        if(i>=ret.length())
        {
          flag=1;
          break;
        }
        
      }
      
      if(flag==1)
      {
        return(ret);  
      }
      return("");
      
        
    }
}
