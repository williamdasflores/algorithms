package stack;

public class StackArray {
    private int size;
    private Object[] array;
    private final int DEFAULT_SIZE = 10;

    public StackArray() {
        this.size = 0;
        this.array = new Object[DEFAULT_SIZE];
    }

    public Object peek() {
        return this.array[size];
    }

    public void pop() {
        if (this.size == 0) {
            return;
        }

        if (this.size == 1) {
            this.array[0] = null;
        } else {
            this.array[size] = null;
        }
        this.size--;
    }

    public void push(Object value) {
        if (this.size == 0) {
            this.array[size] = value;
        } else {
            this.array[size + 1] = value;
        }
        this.size++;
    }

}
