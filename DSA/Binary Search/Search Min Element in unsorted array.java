Link-https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/

class Solution {
    public int findMin(int[] nums) 
    {
      if(nums.length==0 || nums==null)
      {
        return(0);
      }
      int  i=0,mid=0,start=0,end=0,min=0;
      start=0;
      end=nums.length-1;
      while(start<=end)
      {
        mid=start+(end-start)/2;
        System.out.println(mid);
        if(nums[mid]<=nums[start] && nums[mid]<=nums[end])
        {
          return(nums[mid]);
        }
        else if(nums[mid]>nums[start])
        {
          start=mid+1;
        }
        else
        {
          end=mid-1;
        }
      }
      return(-1);
        
    }
}
