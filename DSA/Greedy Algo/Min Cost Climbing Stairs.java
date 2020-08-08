Link-https://leetcode.com/problems/min-cost-climbing-stairs/submissions/

class Solution {
    public int minCostClimbingStairs(int[] cost) 
    {
      int i=0,j=0;
      for(i=2;i<cost.length;i++)
      {
        cost[i]+=Math.min(cost[i-1],cost[i-2]);
      }
      return(Math.min(cost[cost.length-1],cost[cost.length-2]));
        
    }
}
