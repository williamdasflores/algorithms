package queue;

public class TestQueue {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue("fist");
        queue.enqueue("second");
        queue.enqueue("third");
        queue.enqueue("forth");
        System.out.println(queue.peek());
        System.out.println(queue.isEmpty());
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        System.out.println(queue.isEmpty());
    }
}
