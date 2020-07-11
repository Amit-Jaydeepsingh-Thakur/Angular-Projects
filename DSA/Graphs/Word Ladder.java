Link-https://leetcode.com/problems/word-ladder/submissions/

class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) 
    {
      
      if(wordList==null || wordList.size()==0)
      {
        return(0);
      }
      if(!wordList.contains(endWord))
      {
        return(0);
      }
      int i=0,j=0,size=0,ret=1;
      String str="";
      Map<String,Boolean>map=new HashMap<>();
      for(i=0;i<wordList.size();i++)
      {
        if(!map.containsKey(wordList.get(i)))
        {
          map.put(wordList.get(i),false);
        }
      }
      Queue<String>q=new LinkedList<>();
      q.add(beginWord);
      map.put(beginWord,true);
      while(!q.isEmpty())
      {
        size=q.size();
        for(i=0;i<size;i++)
        {
          str=q.poll();
          if(str.equals(endWord))
          {
            return(ret);
          }
          wordMatch(str,map,q);
        }
        ret++;
      }
      return(0);
    }
  
  public void wordMatch(String w,Map<String,Boolean>map,Queue<String>q)
  {
    int i=0,j=0;
    for(i=0;i<w.length();i++)
    {
      char [] word=w.toCharArray();
      for(j=0;j<26;j++)
      {
        char ch=(char)('a'+j);
        word[i]=ch;
        String s=String.valueOf(word);
        
        if(map.containsKey(s) && map.get(s)==false)
        {
          q.add(s);
          map.put(s,true);
        }
      }
    }
  }
}
