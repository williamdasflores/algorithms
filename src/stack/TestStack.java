package stack;

public class TestStack {

    public static void main(String ...args) {
        stackArray();
    }

    private static void stackArray() {
        StackArray stackArray = new StackArray();
        stackArray.push("disc 1");
        stackArray.pop();
        stackArray.push("disc 2");
        stackArray.push("disc 3");
        stackArray.peek();
        stackArray.push("disc 4");
        stackArray.peek();
        stackArray.pop();
        stackArray.peek();
    }

    private static void stackLinkedList() {
        Stack stack = new Stack();
        stack.push("disc 1");
        stack.pop();
        stack.push("disc 2");
        stack.push("disc 3");
        stack.peek();
        stack.push("disc 4");
        stack.peek();
        stack.pop();
        stack.peek();
    }
}
