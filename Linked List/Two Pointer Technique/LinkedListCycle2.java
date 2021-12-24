public class LinkedListCycle {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        if(head.next == head) return head;
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next !=null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                break;
            }
        }
        if (slow != fast) {
            return null;
        }
        slow = head;
        while (slow.next != null) {
            if (slow == fast) break;
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
          
    }    
}
