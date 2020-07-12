Link-https://leetcode.com/problems/partition-labels/submissions/

class Solution {
    public List<Integer> partitionLabels(String S) 
    {
      
      int i=0,j=0,k=0,size=0,part=0;
      Map<Character,Integer>map=new HashMap<>();
      List<Character>visited=new ArrayList<>();
      List<Integer>list=new ArrayList<>();
      if(S.length()==0 || S==null)
      {
        return(list);
      }
      for(char ch:S.toCharArray())
      {
        map.put(ch,map.getOrDefault(ch,0)+1);
      }
      
      while(k<S.length())
      {
        size=S.length();
        StringBuilder sb=new StringBuilder();
        visited.clear();
        for(j=k;j<size && j<S.length();j++)
        {
          if(j==k)
          {
            size=0;
            size=size+k+map.get(S.charAt(j));
            if(!visited.contains(S.charAt(j)))
            {
              visited.add(S.charAt(j));  
            }
            
          }
          if(!visited.contains(S.charAt(j)))
          {
            size+=map.get(S.charAt(j)); 
            visited.add(S.charAt(j)); 
          }
          
          sb.append(S.charAt(j));
        }
        k=j;
  
        list.add(sb.length());
      }
      
      return(list);
    }
}
