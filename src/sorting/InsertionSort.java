package sorting;

import java.sql.SQLOutput;
import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        InsertionSort sort = new InsertionSort();
        int[] array =  {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};
        int[] arraySorted = sort.insertionSort(array);
        Arrays.stream(arraySorted).forEach(i -> System.out.print(i + " "));

    }

    public int[] insertionSort(int[] array) {

        for (int i = 1; i < array.length; i++) {
           int counter = i;
           while (counter > 0) {
               if (array[counter-1] > array[counter]) {
                   int aux = array[counter-1];
                   array[counter-1] = array[counter];
                   array[counter] = aux;
               }
               counter--;
           }
        }

        return array;
    }
}
