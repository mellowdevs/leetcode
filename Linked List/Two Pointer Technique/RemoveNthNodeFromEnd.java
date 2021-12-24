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
class RemoveNthNodeFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (n < 0 || head == null) {
            return null;
        }
        ListNode pointer = head;
        int size = 1;
        while(pointer.next != null) {
            size++;
            pointer = pointer.next;
        }
        if (size == 1) {
            head = null;
            return head;
        }
        pointer = head;
        int deleteIndex = size - n;
        if (deleteIndex == 0) {
            head = head.next;
            return head;
        }
        for (int i = 0; i < deleteIndex - 1; i++) {
            pointer = pointer.next;
        }
        if (pointer.next != null){
            pointer.next = pointer.next.next;
        } else {
            pointer.next = null;
        }
        return head;
        
    }
}