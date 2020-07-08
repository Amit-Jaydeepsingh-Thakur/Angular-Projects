https://leetcode.com/problems/car-pooling/submissions/

class Solution {
    public boolean carPooling(int[][] trips, int capacity) 
    {
      if(trips.length==0 || trips==null)
      {
        return(false);
      }
      int i=0,j=0,numPass=0,start=0,end=-0,max=0;
      for(int [] info:trips)
      {
        end=info[2];
        max=Math.max(max,end);
      }
      int pass[];
      pass=new int[max+1];
      
      for(int []info:trips)
      {
        numPass=info[0];
        start=info[1];
        end=info[2];
        if(start>end)
        {
          return(false);
        }
        for(j=start;j<end;j++)
        {
          pass[j]=pass[j]+numPass;
          if(pass[j]>capacity)
          {
            return(false);
          }
        }
      }
      return(true);
        
    }
}
