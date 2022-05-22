package doubly_linkedlist;

public class Node {
    private Object value;
    Node next;
    Node previous;

    public Node(Object value) {
        this.value = value;
        this.next = null;
        this.previous = null;
    }

    public String getValue() {
        return String.valueOf(value);
    }
}
