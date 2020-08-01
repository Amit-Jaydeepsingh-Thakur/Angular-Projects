Link-https://leetcode.com/explore/challenge/card/august-leetcoding-challenge/549/week-1-august-1st-august-7th/3409/

class Solution {
    public boolean detectCapitalUse(String word) 
    {
      if(word==null || word.length()==0)
      {
        return(true);
      }
      int i=0,size1=0,size2=0;
      for(i=1;i<word.length();i++)
      {
        char ch=word.charAt(i);
        if(ch>='A' && ch<='Z')
        {
          size1++;
        }
        else
        {
          size2++;
        }
      }
      if(size1==word.length()-1 && size2==0 && word.charAt(0)>='A' && word.charAt(0)<='Z')
      {
        return(true);
      }
      else if(size2==word.length()-1 && size1==0 && word.charAt(0)>='A' && word.charAt(0)<='Z')
      {
        return(true);
      }
      else if(word.charAt(0)>='A' && word.charAt(0)<='Z' && size1==0 && size2==0)
      {
        return(true);
      }
      else if(size1==0 && size2==word.length()-1 && word.charAt(0)>='a' && word.charAt(0)<='z')
      {
        return(true);
      }
      else
      {
        return(false);
      }
        
    }
}
