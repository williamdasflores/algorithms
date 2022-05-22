package sorting;

import java.util.Arrays;
import java.util.List;

public class MergeSort {

    public static void test(String[] args) {
        MergeSort sort = new MergeSort();
        int[] array = {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};

        int[] arraySorted = sort.mergeSort(array);
        Arrays.stream(arraySorted).forEach(i -> System.out.print(i + " "));
    }

    public int[] mergeSort(int[] array) {
        if (array.length == 1) {
            return array;
        }

        int length = array.length;
        int middle = length / 2;
        int[] arrayLeft = Arrays.copyOfRange(array, 0, middle);
        int[] arrayRight = Arrays.copyOfRange(array, middle, length);

        return merge(array, mergeSort(arrayLeft), mergeSort(arrayRight));
    }

    private int[] merge(int[] array, int[] left, int[] right) {
        int index = 0, leftIndex = 0, rightIndex = 0;

        while (leftIndex < left.length && rightIndex < right.length) {
            if (left[leftIndex] < right[rightIndex]) {
                array[index++] = left[leftIndex++];
            } else {
                array[index++] = right[rightIndex++];
            }
        }

        while (leftIndex < left.length) {
            array[index++] = left[leftIndex++];
        }
        while(rightIndex < right.length) {
            array[index++] = right[rightIndex++];
        }


        return array;
    }
}
