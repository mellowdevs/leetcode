

public class IntersectionOfTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        
        ListNode pointerA = headA;
        ListNode pointerB = headB;
        
        while (pointerA != pointerB) {
            pointerA = pointerA.next;
            pointerB = pointerB.next;
            
            if (pointerA == pointerB) {
                return pointerA;
            }
            
            
            if (pointerA == null) {
                pointerA = headB;
            }
            if (pointerB == null) {
                pointerB = headA;
            }
        }
        return pointerA;
            
    }
}
