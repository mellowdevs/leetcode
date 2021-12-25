
public class isLinkedListPalindrome {
    public boolean isPalindrome(ListNode head) {
        if(head == null) return false;
        ListNode current = head;
        Stack<Integer> stack = new Stack<>();
        while(current != null) {
            stack.push(current.val);
            current = current.next;
        }
        while(head != null) {
            if (head.val != stack.pop()) {
                return false;
            } else {
                head = head.next;
            }
            
        }
        return true;
    }
    
}
