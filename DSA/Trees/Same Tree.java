Link-https://leetcode.com/explore/featured/card/july-leetcoding-challenge/545/week-2-july-8th-july-14th/3389/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) 
    {
      if(p==null && q==null)
      {
        return(true);
      }
      
      if(p==null || q==null)
      {
        return(false);
      }
      
      return((p.val==q.val)&&isSameTree(p.left,q.left) && isSameTree(p.right,q.right));
        
    }
}
