package linkedlist;

public class Node {
    private Object value;
    Node next;

    public Node(Object value) {
        this.value = value;
        this.next = null;
    }

    public String getValue() {
        return String.valueOf(value);
    }
}
