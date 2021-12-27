

public class FlattenMultilevelDoublyLinkedList {
    public Node flatten(Node head) {
        if(head == null) return null;
        Node curr = head;
        Node currHead = curr;
        while(curr != null) {
            if (curr.child != null) {
                Node saveNext = curr.next;
                Node child = curr.child;
                child.prev = curr;
                curr.next = child;
                while(child.next != null) {
                    child = child.next;
                }
                if(saveNext != null) {
                saveNext.prev = child;
                }
                child.next = saveNext;
                curr.child = null;
            }
            curr = curr.next;
        }
        return currHead;
    }
    
}
