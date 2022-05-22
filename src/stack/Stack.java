package stack;

public class Stack {
    private Node top;
    private Node bottom;
    private int length;

    public Stack() {
        this.top = null;
        this.bottom = null;
        this.length = 0;
    }

    public Node peek() {
        return this.top;
    }

    public void push(Object value) {
        if (this.bottom == null) {
            this.bottom = new Node(value);
            this.top = this.bottom;
        } else {
            Node holdingNode = this.top;
            this.top = new Node(value);
            this.top.next = holdingNode;
        }
        this.length++;
    }

    public void pop() {
        if (this.length == 0) {
            return;
        }

        if (this.length == 1) {
            this.top = null;
            this.bottom = null;
        } else {
            this.top.next = this.top;
        }
        this.length--;
    }

}
