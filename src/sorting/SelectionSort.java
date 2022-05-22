package sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String ...args) {
        SelectionSort sort = new SelectionSort();
        int[] array =  {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};
        int[] arraySorted = sort.selectionSort(array);
        Arrays.stream(arraySorted).forEach(i -> System.out.print(i + " "));
    }

    public int[] selectionSort(int[] array) {
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            int smallest = array[i];
            for (int j = i+1; j < array.length; j++) {
                if (smallest > array[j]) {
                    index = j;
                    smallest = array[j];
                }
            }
            int aux = array[i];
            array[i] = array[index];
            array[index] = aux;

        }

        return array;
    }
}
