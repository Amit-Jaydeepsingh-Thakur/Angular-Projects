Link-https://leetcode.com/explore/featured/card/july-leetcoding-challenge/546/week-3-july-15th-july-21st/3396/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) 
    {
      int i=0;
      if(head==null)
      {
        return(head);
      }
      LinkedList<ListNode>ll=new LinkedList<>();

      while(head!=null)
      {
        if(head.val!=val)
        {
          ll.add(head);
        }
        head=head.next;
        
      }
      if(ll.size()==0)
      {
        return(null);
      }
      ListNode curr=new ListNode(ll.get(0).val);
      ListNode ret=curr;
      for(i=1;i<ll.size();i++)
      {
        ListNode node=new ListNode(ll.get(i).val);
        curr.next=node;
        curr=curr.next;
        
      }
//       ListNode prev=head;
//       ListNode now=head.next;
//       if(prev.val==val)
//       {
//         head=head.next;
//         return(head);
//       }
      
//       while(now!=null && prev!=null)
//       {
//         if(now.val==val)
//         {
//           prev.next=now.next;
//           now=now.next;
//           //System.out.println(prev.val+" "+now.val);
//           //break;
//         }
//         else if(prev.val==val)
//         {
//           prev=prev.next;
//           //head=prev;
//           //break;
//         }
//         if(prev!=null)
//         {
//           prev=prev.next;  
//         }
//         if(now!=null)
//         {
//           now=now.next;  
//         }
        
        
//       }
      return(ret);
    }
}
