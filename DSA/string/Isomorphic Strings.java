Link-https://leetcode.com/problems/isomorphic-strings/submissions/


class Solution {
    public boolean isIsomorphic(String s, String t) 
    {
      if(s.length()==0 && t.length()==0)
      {
        return(true);
      }
      
      if(s==null || s.length()==0)
      {
        return(false);
      }
      if(t==null || t.length()==0)
      {
        return(false);
      }
      int i=0,j=0;
      Set<String>set1=new HashSet<>();
      Set<String>set2=new HashSet<>();
      LinkedHashMap<String,String>map=new LinkedHashMap<>();
      for(i=0;i<s.length();i++)
      {
        set1.add(s.substring(i,i+1));
      }
      for(i=0;i<t.length();i++)
      {
        set2.add(t.substring(i,i+1));
      }
      if(set1.size()!=set2.size())
      {
        return(false);
      }
      //LinkedHashMap<String,String>map2=new LinkedHashMap<>();
      if(s.length()!=t.length())
      {
        return(false);
      }
      for(i=0;i<s.length();i++)
      {
        if(!map.containsKey(s.substring(i,i+1)))
        {
          map.put(s.substring(i,i+1),"");
        }
        map.put(s.substring(i,i+1),t.substring(i,i+1));
      }
      StringBuilder sb=new StringBuilder();
      
      for(i=0;i<s.length();i++)
      {
        sb.append(map.get(s.substring(i,i+1)));
      }
      String p=sb.toString();
      if(p.equals(t))
      {
        return(true);
      }
      return(false);
    }
}
