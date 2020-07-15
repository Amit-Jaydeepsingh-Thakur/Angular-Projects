Link-https://leetcode.com/explore/featured/card/july-leetcoding-challenge/546/week-3-july-15th-july-21st/3391/

class Solution {
    public String reverseWords(String s) 
    {
      if(s==null || s.length()==0)
      {
        return("");
      }
      int i=0,j=0;
      String ret1=s.trim();
      String []words=ret1.split("\\s+");
      for(i=0;i<words.length;i++)
      {
        System.out.println(words[i]);
      }
      StringBuilder sb=new StringBuilder();
      for(i=words.length-1;i>=0;i--)
      {
        sb.append(words[i]);
        sb.append(" ");
      }
      String ret=sb.toString().trim();
      return(ret);
        
    }
}
