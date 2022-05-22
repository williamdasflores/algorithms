package sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String ...args) {
        BubbleSort sort = new BubbleSort();
        int[] array =  {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};
        int[] arraySorted = sort.bubbleSort(array);
        Arrays.stream(arraySorted).forEach(i -> System.out.print(i + " "));
    }


    public int[] bubbleSort(int[] array) {
       int counter = array.length;
       while (counter > 0) {
           for (int i = 0; i < array.length -1; i++) {
               if (array[i] > array[i+1]) {
                   int temp = array[i];
                   array[i] = array[i + 1];
                   array[i + 1] = temp;
               }
           }
           counter--;
       }
       return array;
    }

}
