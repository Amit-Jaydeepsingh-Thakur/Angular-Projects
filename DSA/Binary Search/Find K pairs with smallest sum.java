link-https://leetcode.com/problems/find-k-pairs-with-smallest-sums/

class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) 
    {
      
      int i=0,j=0,diff=0;
      PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->(a[0]-b[0]));
      List<List<Integer>>list=new ArrayList<>();
      if(nums1==null || nums1.length==0 || nums2==null || nums2.length==0 || k==0)
      {
        return(list);
      }
      int sum=0;
      for(i=0;i<nums1.length;i++)
      {
        for(j=0;j<nums2.length;j++)
        {
          sum=nums1[i]+nums2[j];
          pq.add(new int[]{sum,nums1[i],nums2[j]});
        }
      }
      while(!pq.isEmpty() && k!=0)
      {
        int [] arr=pq.poll();
        List<Integer>p=new ArrayList<>();
        p.add(arr[1]);
        p.add(arr[2]);
        list.add(p);
        //p.clear();
        k--;
      }
      
      return(list);
    }
}
