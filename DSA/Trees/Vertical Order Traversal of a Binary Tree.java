Link-https://leetcode.com/explore/featured/card/august-leetcoding-challenge/549/week-1-august-1st-august-7th/3415/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) 
    {
      
      int i=0,j=0,k=0,size=0,left=0,right=0,m=0;
      Queue<Pair<TreeNode,int[]>>q=new LinkedList<>();
      LinkedHashMap<Integer,List<int[]>>map=new LinkedHashMap<>();
      q.add(new Pair(root,new int[]{0,0}));
      List<List<Integer>>list=new ArrayList<>();
      if(root==null)
      {
        return(list);
      }
      while(!q.isEmpty())
      {
        size=q.size();
        for(i=0;i<size;i++)
        {
          Pair<TreeNode,int[]>pair=q.poll();
          TreeNode node=pair.getKey();
          int []arr=pair.getValue();
          left=arr[0];
          right=arr[1];
          //System.out.println(node.val);
          if(!map.containsKey(left))
          {
            map.put(left,new ArrayList<>());
          }
          map.get(left).add(new int[]{right,left,node.val});
          if(node.right!=null)
          {
            q.add(new Pair<>(node.right,new int[]{left+1,right-1}));
          }
          if(node.left!=null)
          {
            q.add(new Pair<>(node.left,new int[]{left-1,right-1}));
          }
          
          
        }
      }
      List<Integer>sorted=new ArrayList<>(map.keySet());
      Collections.sort(sorted);
      for(i=0;i<sorted.size();i++)
      {
        //System.out.println(e.getKey()+" "+e.getValue());
        m=sorted.get(i);
        List<int[]>p=map.get(m);
        Collections.sort(p,new Comparator<int[]>(){
                     public int compare(int[] a,int[] b)
            {
              if(a[0]==b[0] && a[1]==b[1])
              {
                return(a[2]-b[2]);
              }
              
              else
              {
                return(b[0]-a[0]);
              }
            }
          });
        List<Integer>out=new ArrayList<>();
        for(int[]arr:p)
        {
          //Arrays.sort(arr,
          out.add(arr[2]);
        }
        //Collections.sort(out,(a,b)->(a[1]-b[1]));
        list.add(out);
      }
      return(list);
        
    }
}
