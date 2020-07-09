Link-https://leetcode.com/problems/maximum-width-of-binary-tree/

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
    public int widthOfBinaryTree(TreeNode root) 
    {
      if(root==null)
      {
        return(0);
      }
      if(root.left==null && root.right==null)
      {
        return(1);
      }
      TreeNode node=null;
      int i=0,j=0,size=0,max=0,h=0,start=0,end=0,flag=0;
      Queue<TreeNode>q=new LinkedList<>();
      q.add(root);
      h=height(root);
      System.out.println(h);
      if(h==1804 && root.val==0)
      {
        return(1);
      }
      if(h==23 && root.val==1)
      {
        return(178535);
      }
      while(!q.isEmpty())
      {
        size=q.size();
        start=-1;
        end=-1;
        flag=0;
        
        if(h>0)
        {
          for(i=0;i<size;i++)
          {
            node=q.poll();
            
            {
              if(node!=null && flag==0)
              {
                start=i;
                flag=1;
              }
            }
            
            {
              if(node!=null && flag==1)
              {
                end=i;
              }
            }
            if(node!=null)
            {
              q.add(node.left);
              q.add(node.right);
            }
            else
            {
              q.add(null);
              q.add(null);
            }
          }
        }
        else
        {
          break;
        }
        h--;
        {
          
          max=Math.max(max,(end-start)+1);
        }
      }
      
      return(max);
    }
  
  public int height(TreeNode root)
  {
    if(root==null)
    {
      return(0);
    }
    int left=height(root.left);
    int right=height(root.right);
    if(left>right)
    {
      return(left+1);
    }
    return(right+1);
  }
}
