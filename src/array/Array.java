package array;

public class Array {
    private int size;
    private Object[] objects;
    private int DEFAULT_SIZE = 10;

    public Array() {
        this.size = 0;
        this.objects = new Object[DEFAULT_SIZE];
    }

    public Array(int size) {
        this.size = 0;
        this.objects = new Object[size];
    }

    public int size() {
        return this.size;
    }

    public Object get(int index) {
        return this.objects[index];
    }

    public void push(Object item) {
        if (this.size < DEFAULT_SIZE) {
            this.objects[this.size] = item;
            this.size++;
            return;
        }
        this.grow(item);
    }

    private void grow(Object item) {
        Object[] objectsAux = this.objects.clone();
        this.objects = new Object[++this.size];
        for (int i = 0; i < objectsAux.length; i++) {
            this.objects[i] = objectsAux[i];
        }
        this.objects[this.size -1] = item;
    }

    public void pop() {
        Object[] objectsAux = new Object[--this.size];
        for (int i = 0; i < this.size; i ++) {
            objectsAux[i] = this.objects[i];
        }
        this.objects = objectsAux.clone();

    }


}
