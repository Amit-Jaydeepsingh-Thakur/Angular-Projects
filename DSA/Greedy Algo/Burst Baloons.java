link-https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/submissions/

class Solution {
    public int findMinArrowShots(int[][] points) 
    {
      if(points==null || points.length==0)
      {
        return(0);
      }
      int i=0,j=0,k=1,arrowPos=0;
      Arrays.sort(points,(a,b)->(a[1]-b[1]));
      arrowPos=points[0][1];
      for(i=1;i<points.length;i++)
      {
        System.out.println(points[i][0]+" "+points[i][1]);
        if(arrowPos>=points[i][0])
        {
          continue;
        }
        k++;
        arrowPos=points[i][1];
      }
      return(k);
    }
}
