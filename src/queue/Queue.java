package queue;

public class Queue {
    private Node first;
    private Node last;
    private int length;

    public Queue() {
        this.length = 0;
    }

    public Node peek() {
        return this.first;
    }

    public void enqueue(Object value) {
        Node newNode = new Node(value);
        if (this.length == 0) {
            this.first = newNode;
            this.last = newNode;
        } else {
           this.last.next = newNode;
           this.last = newNode;
        }
        this.length++;
    }

    public Node dequeue() {
        if (this.length == 0) {
            return null;
        } else if (this.length == 1) {
            Node holdingPointer = this.first;
            this.first = null;
            this.last = null;
            this.length--;
            return holdingPointer;
        } else {
            this.first = this.first.next;
            this.length--;
            return first;
        }
    }

    public boolean isEmpty() {
        return this.length == 0;
    }
}
