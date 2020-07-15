Link-https://leetcode.com/problems/house-robber-ii/submissions/

class Solution {
    public int rob(int[] nums) 
    {
      int ret1=0,ret2=0;
      if(nums==null || nums.length==0)
      {
        return(0);
      }
      if(nums.length==1)
      {
        return(nums[0]);
      }
      ret1=rob0(nums);
      ret2=rob1(nums);
      return(Math.max(ret1,ret2));
    }
  
  public int rob0(int []nums)
  {
    int i=0,t=0,curr=0,pre=0;
    for(i=0;i<nums.length-1;i++)
    {
      t=curr;
      curr=Math.max(pre+nums[i],curr);
      pre=t;
    }
    return(curr);
    
  }
  
  public int rob1(int []nums)
  {
    int i=0,t=0,curr=0,pre=0;
    for(i=1;i<nums.length;i++)
    {
      t=curr;
      curr=Math.max(pre+nums[i],curr);
      pre=t;
    }
    return(curr);
    
  }
}
