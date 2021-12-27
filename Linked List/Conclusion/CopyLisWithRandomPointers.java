
public class CopyLisWithRandomPointers {
    public Node copyRandomList(Node head) {
        if (head == null) return null; 
        Node current = head;
        Node saveNext = null;
        //  A --> A' --> B --> B' --> C --> C' --> D --> D'
        while(current != null) {
            saveNext = current.next;
            current.next = new Node(current.val);
            current.next.next = saveNext;
            current = saveNext;
        }
        current = head;
        while(current != null) {
            if(current.next != null) {
                current.next.random = (current.random == null) ? current.random : current.random.next;
            }
            current = current.next.next;
        }
        Node original = head;
        Node copy = head.next;
        saveNext = copy;
        while(original != null) {
            original.next = original.next.next;
            copy.next = (copy.next != null) ? copy.next.next : copy.next;
            original = original.next;
            copy = copy.next;
        }
        return saveNext;
    }
    
}
