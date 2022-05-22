package doubly_linkedlist;

import java.util.Arrays;

public class TestDoublyLinkedList {

    public static void main(String... args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList(10);
        doublyLinkedList.append(5);
        doublyLinkedList.append(16);

        doublyLinkedList.prepend(1);
        doublyLinkedList.prepend(30);

        doublyLinkedList.append(31);

        System.out.print("[");
        Arrays.asList(doublyLinkedList.printLinkedList())
                .forEach(value -> System.out.print(value + " "));
        System.out.print("]");

        doublyLinkedList.insert(2, 99);
        doublyLinkedList.remove(1);

       // System.out.println(doublyLinkedList.getLength());
        System.out.print("[");
        Arrays.asList(doublyLinkedList.printLinkedList())
                .forEach(value -> System.out.print(value + " "));
        System.out.print("]");
    }
}
