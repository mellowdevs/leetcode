
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        ListNode current = head.next;
        ListNode newHead = head;   
        while (current != null) {
            head.next = current.next;
            current.next = newHead;
            newHead = current;
            current = head.next;
        }
        return newHead;
        
    }
    
}
