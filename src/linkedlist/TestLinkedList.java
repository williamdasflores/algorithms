package linkedlist;

import java.util.Arrays;

public class TestLinkedList {

    public static void main(String... args) {
        LinkedList linkedList = new LinkedList(10);
        linkedList.append(5);
        linkedList.append(16);

        linkedList.prepend(1);
        linkedList.prepend(30);

        linkedList.append(31);
        linkedList.insert(2, 99);


        System.out.print("[ ");
        Arrays.asList(linkedList.printLinkedList())
                .forEach(value -> System.out.print(value + " "));
        System.out.print("]");
        System.out.println();
       linkedList.reverse();




    }
}
