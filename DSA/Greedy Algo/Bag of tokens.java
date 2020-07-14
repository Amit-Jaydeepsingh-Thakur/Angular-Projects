Link-https://leetcode.com/problems/bag-of-tokens/submissions/

class Solution {
    public int bagOfTokensScore(int[] tokens, int P) 
    {
      if(tokens==null || tokens.length==0)
      {
        return(0);
      }
      int start=0,end=0,power=P,max=0,points=0,flag=1;
      Arrays.sort(tokens);
      end=tokens.length-1;
      
      while(start<=end)
      {
        if(power-tokens[start]>=0)
        {
          power=power-tokens[start];
          points++;
          start++;
          max=Math.max(max,points);
        }
        else if(points>=1)
        {
          power=power+tokens[end];
          points--;
          end--;
        }
        else
        {
          break;
        }
        
      }
      return(max);
        
    }
}
