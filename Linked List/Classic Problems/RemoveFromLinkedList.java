public class RemoveFromLinkedList {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;
        ListNode current = head;
        while(current.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next;
    
            } else {
                current = current.next;
            }
        }
        return head.val == val ? head.next : head;
    }
 /*    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;
        ListNode current = head;
        ListNode prev = null;
        while(current != null) {
            if (current.val == val) {
                if(current == head) {
                    current = current.next;
                    head = current;
                    prev = null;
                } else if (current.next == null) {
                    prev.next = null;
                    break;
                } else {
                    prev.next = current.next;
                    current = current.next;
                }
            } else {
                prev = current;
                current = current.next;
            }
        }
        
        return head;
    } */
    
}
