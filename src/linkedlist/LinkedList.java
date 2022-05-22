package linkedlist;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length = 0;

    public LinkedList(Object value) {
        this.head = new Node(value);
        this.tail = this.head;
        length++;
    }

    public void append(Object value) {
        Node node = new Node(value);
        this.tail.next = node;
        this.tail = node;
        length++;
    }

    public void prepend(Object value) {
        Node node = new Node(value);
        node.next = this.head;
        this.head = node;
        length++;
    }

    public void insert(int index, Object value) {
        if (index == 0) {
            prepend(value);
            return;
        }

        if (index >= this.length) {
            append(value);
            return;
        }

        Node newNode = new Node(value);
        Node leaderNode = getNodeByIndex(index - 1);
        Node pointerNode = leaderNode.next;
        leaderNode.next = newNode;
        newNode.next = pointerNode;
        this.length++;
    }

    public void remove(int index) {
        if (index > this.length) {
            return;
        }

        if (index == 0) {
            this.head = getNodeByIndex(index + 1);
            this.length--;
            return;
        }

        Node leaderNode = getNodeByIndex(index - 1);
        Node unwantedNode = leaderNode.next;
        leaderNode.next = unwantedNode.next;
        this.length--;

    }



    private Node getNodeByIndex(int index) {
        int count = 0;
        Node currentNode = this.head;
        while (count != index) {
            currentNode = currentNode.next;
            count++;
        }
        return currentNode;
    }

    public LinkedList reverse() {
        if (this.getLength() == 0) {
            return this;
        }
        //TODO
        return this;
    }

    public String[] printLinkedList() {
        int index = 0;
        String[] array = new String[this.length];
        Node currentNode = this.head;

        while (currentNode != null) {
            array[index] = currentNode.getValue();
            currentNode = currentNode.next;
            index++;
        }
        return array;
    }

    public int getLength() {
        return length;
    }

}
