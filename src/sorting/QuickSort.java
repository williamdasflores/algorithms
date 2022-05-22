package sorting;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] array =  {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};
        QuickSort quickSort = new QuickSort();
        int[] arraySorted = quickSort.quickSort(array);
        Arrays.stream(arraySorted).forEach(value -> System.out.print(value + " "));
    }

    public int[] quickSort(int[] array) {
        sort(array, 0, array.length -  1);
        return array;
    }

    private void sort(int[] array, int start, int end) {
        if (end > start) {
            int pivot = split(array, start, end);
            sort(array, start, pivot - 1);
            sort(array, pivot + 1, end);
        }
    }

    private int split(int[] array, int start, int end) {
        int pivot, left, right = end;
        left = start + 1;
        pivot = array[start];

        while (left <= right) {
            while (left <= right && array[left] <= pivot) {
                left++;
            }

            while(right >= left && array[right] > pivot) {
                right--;
            }

            if (left < right) {
                change(array, right, left);
                left++;
                right--;
            }
        }

        change(array, start, right);
        return right;
    }

    private void change(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
