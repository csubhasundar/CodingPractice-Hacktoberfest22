//https://leetcode.com/problems/remove-nth-node-from-end-of-list/
class RemoveNthNodeFromEndOfList {
    /*
    Fast and slow pointer
    Time complexity - o(N) (N - length of linkedList)
    Space complexity - o(1)
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slowPointer = head;
        ListNode fastPointer = head;

        for(int i=0; i<n; i++){
            fastPointer = fastPointer.next;
        }

        if(fastPointer == null){
            return slowPointer.next;
        }

        while(fastPointer.next != null){
            fastPointer = fastPointer.next;
            slowPointer = slowPointer.next;
        }

        slowPointer.next = slowPointer.next.next;
        return head;
    }
}