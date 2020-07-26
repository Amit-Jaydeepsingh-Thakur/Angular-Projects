Link-https://leetcode.com/explore/featured/card/july-leetcoding-challenge/547/week-4-july-22nd-july-28th/3401/

class Solution {
    public int findMin(int[] nums) 
    {
      if(nums.length==0)
      {
        return(0);
      }
      int i=0,start=0,end=0,mid=0,min=Integer.MAX_VALUE;
      end=nums.length-1;
      for(i=0;i<nums.length;i++)
      {
        min=Math.min(min,nums[i]);
      }
      return(min);
        
    }
}
