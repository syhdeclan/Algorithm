package Year2021.January;

import java.util.Arrays;

public class QuickSort {

    public int partition(int[] arr, int start, int end) {
        int pos = start;
        int index = arr[start++];
        while (start < end) {
            while (arr[start] < index && start < end) {
                start++;
            }
            while (arr[end] > index && start < end) {
                end--;
            }
            if (start < end) {
                swap(arr,start,end);
            }
        }
        swap(arr,start - 1, pos);
        return start - 1;
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void quickSort(int[] arr, int start, int end) {
        int index = partition(arr, start, end);
        if (index > start) {
            quickSort(arr, start, index);
        }
        if (index < end) {
            quickSort(arr, index + 1, end);
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 3, 2, 5, 14, 7, 4, 8, 1, 2};
        new QuickSort().quickSort(arr,0,arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }


}
