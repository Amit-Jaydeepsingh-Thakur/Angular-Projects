Link-https://leetcode.com/problems/valid-anagram/submissions/

class Solution {
    public boolean isAnagram(String s, String t) 
    {
      if(s==null || t==null)
      {
        return(false);
      }
      if(s==null && t==null)
      {
        return(false);
      }
      
      int i=0,j=0;
      char []arr1=s.toCharArray();
      char []arr2=t.toCharArray();
      Arrays.sort(arr1);
      Arrays.sort(arr2);
      String str1=new String(arr1);
      String str2=new String(arr2);
      System.out.println(str2);
      if(str1.equals(str2))
      {
        return(true);
      }
      return(false);
        
    }
}
