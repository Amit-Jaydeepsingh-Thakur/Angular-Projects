Link-https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/submissions/

class Solution {
    public int kthSmallest(int[][] matrix, int k) 
    {
      if(matrix==null || matrix.length==0)
      {
        return(0);
      }
      int i=0,j=0,row=matrix.length,col=matrix[0].length;
      PriorityQueue<Integer>pq=new PriorityQueue<>((a,b)->(b-a));
      
      for(i=0;i<matrix.length;i++)
      {
        for(j=0;j<matrix[0].length;j++)
        {
          //if(pq.size()<=k)
            pq.add(matrix[i][j]);
        }
      }
      while(!pq.isEmpty() && pq.size()!=k)
      {
        pq.poll();
      }
      return(pq.peek());
    }
}
