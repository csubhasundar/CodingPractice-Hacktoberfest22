// ! Problem-Statement: https://leetcode.com/problems/linked-list-cycle-ii/
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null)
            return null;
       
        ListNode fast=head,slow=head,entry=head;
        
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast) {
                while(slow!=entry){
                    slow=slow.next;
                    entry=entry.next;

                }
                return entry;
                    
            }
            
        }
        return null;
        
    }
}