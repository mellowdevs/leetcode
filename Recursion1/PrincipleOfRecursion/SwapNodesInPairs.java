package Recursion1.PrincipleOfRecursion;

public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        if(head == null) return null;
        if (head.next == null) return head;
        ListNode newHead = head.next;
        head.next = swapPairs(head.next.next);
        newHead.next = head;
        return newHead;
    }
    
}
