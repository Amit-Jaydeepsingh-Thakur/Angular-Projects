Link-https://leetcode.com/problems/longest-word-in-dictionary-through-deleting/submissions/

class Solution {
    public String findLongestWord(String s, List<String> d) 
    {
      if(s==null || s.length()==0 || d.size()==0)
      {
        return("");
      }
      int i=0,j=0,flag=0,size=0;
      String ret="";
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
      for(String p:d)
      {
        pq.add(p);
      }
      while(!pq.isEmpty())
      {
        String p=pq.poll();
        
        if(LCS(p,s))
        {
          flag=1;
          ret=p;
          break;
        }
      }
      
      if(flag==1)
      {
        return(ret);  
      }
      return("");
    }
  
  public boolean LCS(String p,String s)
  {
    int i=0,j=0,m=0,n=0;
    
    
    while(i<s.length() && j<p.length())
    {
      if(s.charAt(i)==p.charAt(j))
      {
        i++;
        j++;
      }
      else
      {
        i++;
      }
    }
    return(j==p.length());
  }
}
