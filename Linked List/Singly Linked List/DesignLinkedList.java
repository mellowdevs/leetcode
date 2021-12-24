
public class DesignLinkedList {
    class MyLinkedList {
        class Node {
            int val;
            Node next;
            public Node(int val) {
                this.val = val;
            }
        }
        
        Node head;
        Node tail;
        int size;
    
        public MyLinkedList() {
            head = null;
            tail = null;
            size = 0;
        }
        
        public int get(int index) {
            if (index >= size) {
                return -1;
            }
            Node node = head; 
            for(int i = 0; i < index; i++) {
                node = node.next;
            }
            return node.val;
            
        }
        
        public void addAtHead(int val) {
            Node node = new Node(val);
            node.next = head;
            head = node;
            size++;
            if (node.next == null) {
                tail = head;
            }     
        }
        
        public void addAtTail(int val) {
            Node node = new Node(val);
            if (tail != null) {
                tail.next = node;
            }
            if (tail == null || size == 0) {
                head = node;
            }
            tail = node;
            size++;    
        }
        
        public void addAtIndex(int index, int val) {
            if (index > size || index < 0) {
                return;
            }
            if (index == 0) {
                addAtHead(val);
            } else if (index == size) {
                addAtTail(val);
            } else {
            Node node = head; 
                for(int i = 0; i < index - 1; i++) {
                    node = node.next;
                }
                Node newNode = new Node(val);
                newNode.next = node.next;
                node.next = newNode;
                size++;
            }
        }
        
        public void deleteAtIndex(int index) {
            if (index >= size || index < 0 ||size == 0) {
                return;
            }
            if (index == 0) {
                head = head.next;
                size--;
                if(size == 0) {
                    tail = null;
                }
            } else {
                Node node = head; 
                for(int i = 0; i < index - 1; i++) {
                    node = node.next;
                }
                node.next = node.next.next;   
                size--;
                if(node.next == null) {
                        tail = node;
                }
            }     
        }
    }
    
    /**
     * Your MyLinkedList object will be instantiated and called as such:
     * MyLinkedList obj = new MyLinkedList();
     * int param_1 = obj.get(index);
     * obj.addAtHead(val);
     * obj.addAtTail(val);
     * obj.addAtIndex(index,val);
     * obj.deleteAtIndex(index);
     */
    
}
