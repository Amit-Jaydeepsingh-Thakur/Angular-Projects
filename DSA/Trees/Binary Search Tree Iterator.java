Link-https://leetcode.com/problems/binary-search-tree-iterator/submissions/

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
class BSTIterator 
{
  public PriorityQueue<Integer>pq;
  public List<Integer>list=new ArrayList<>();
  public void inorder(TreeNode root,PriorityQueue<Integer>pq)
  {
    if(root==null)
    {
      return;
    }
    inorder(root.left,pq);
    pq.add(root.val);
    inorder(root.right,pq);
  }
    public BSTIterator(TreeNode root) 
    {
      int i=0,j=0;
      pq=new PriorityQueue<>((a,b)->(a-b));
      list=new ArrayList<>();
      inorder(root,pq);
    }
    
    /** @return the next smallest number */
    public int next() 
    {
      if(pq.size()>0)
      {
        return(pq.poll());
      }
      else
      {
        return(-1);
      }
        
    }
    
    /** @return whether we have a next smallest number */
    public boolean hasNext() 
    {
      if(pq.size()>0)
      {
        return(true);
      }
      return(false);
        
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
