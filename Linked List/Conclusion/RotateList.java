package Linked List.Conclusion;

public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k == 0) return head;
        ListNode current = head;
        int size = 1;
        while(current.next != null) {
            current = current.next;
            size++;
        }
        current.next = head;
        k = size - (k%size);
        for (int  i = 0; i < k; i++) {
            current = current.next;
        }
        head = current.next;
        current.next = null;
        return head;
        
    }
    
}
