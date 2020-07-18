Link-https://leetcode.com/problems/network-delay-time/submissions/

class Solution {
    public int networkDelayTime(int[][] times, int N, int K)
    {
      int i=0,j=0,k=0,max=-1;
      int dist[];
      dist=new int[N+1];
      
      for(i=0;i<=N;i++)
      {
        dist[i]=Integer.MAX_VALUE-500;
      }
      
      dist[0]=-1;
      dist[K]=0;
      
      for(i=0;i<N;i++)
      {
        for(j=0;j<times.length;j++)
        {
          int u=times[j][0];
          int v=times[j][1];
          int w=times[j][2];
          
          dist[v]=Math.min(dist[v],dist[u]+w);
        }
      }
      
      for(i=0;i<=N;i++)
      {
        max=Math.max(max,dist[i]);
      }
        
      if(max==(Integer.MAX_VALUE-500))
      {
        return(-1);
      }
      else
      {
        return(max);
      }
    }
}
