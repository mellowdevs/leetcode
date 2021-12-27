public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode result = null;
    Stack<ListNode> resultStack = new Stack<>();
    Stack<ListNode> resultStack2 = new Stack<>();
    int carry = 0;
    while (l1 != null || l2 != null) {
        if (l1 != null && l2 != null) {
            int sum = l1.val + l2.val + carry;
            if (sum > 9) {
                carry = 1;
                resultStack.push(new ListNode(sum - 10));
            } else {
                carry = 0;
                resultStack.push(new ListNode(sum));
            }
            l1 = l1.next;
            l2 = l2.next;
        } else if (l1 == null) {
            int sum = l2.val + carry;
            if (sum > 9) {
                carry = 1;
                resultStack.push(new ListNode(sum - 10));
            } else {
                carry = 0;
                resultStack.push(new ListNode(sum));
            }

            l2 = l2.next;
        } else {
            int sum = l1.val + carry;
            if (sum > 9) {
                carry = 1;
                resultStack.push(new ListNode(sum - 10));
            } else {
                carry = 0;
                resultStack.push(new ListNode(sum));
            }

            l1 = l1.next;
        }
    }
    if(carry > 0){
        resultStack.push(new ListNode(carry));
    }
    while(!resultStack.isEmpty()) {
        resultStack2.push(resultStack.pop());
    }
    if (!resultStack2.isEmpty()) {
        result = resultStack2.peek();
    }
    while(!resultStack2.isEmpty()) {
        ListNode current = resultStack2.pop();
        if (resultStack2.isEmpty()) {
            current.next = null;
        } else {
            current.next = resultStack2.peek();
        }
    }
    return result;

}