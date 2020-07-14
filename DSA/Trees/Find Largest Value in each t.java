Link-https://leetcode.com/problems/find-largest-value-in-each-tree-row/submissions/

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
    public List<Integer> largestValues(TreeNode root) 
    {
      int i=0,j=0,size=0,maxNode=Integer.MIN_VALUE;
      Queue<TreeNode>q=new LinkedList<>();
      List<Integer>list=new ArrayList<>();
      if(root==null)
      {
        //list.add(maxNode);
        return(list);
      }
      q.add(root);
      
      TreeNode node=null;
      int h=height(root);
      
      while(!q.isEmpty())
      {
        size=q.size();
        maxNode=Integer.MIN_VALUE;
        for(i=0;i<size;i++)
        {
          node=q.poll();
          if(node==null)
          {
            continue;
          }
          maxNode=Math.max(maxNode,node.val);
          q.add(node.left);
          q.add(node.right);
        }
        System.out.println(maxNode);
        if(list.size()<h)
        {
          list.add(maxNode);  
        }
      }
      
      
      
      return(list);
    }
  
  public int height(TreeNode root)
  {
    if(root==null)
    {
      return(0);
    }
    
    int l=height(root.left);
    int r=height(root.right);
    if(l>r)
    {
      return(l+1);
    }
    return(r+1);
  }
}
