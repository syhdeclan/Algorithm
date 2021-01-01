package Year2020.December;

import java.util.Arrays;

/**
 * @author shenyvhao
 * @program Algorithm
 * @description
 * @create 2020-12-27 20
 **/


public class QuickSort {

    public int partition(int[] arr, int start, int end) {
        int index = start++;
        while (start < end) {
            while (arr[start] <= arr[index] && start < end) {
                start++;
            }
            while (arr[end] >= arr[index] && start < end) {
                end--;
            }
            swap(arr, start, end);
        }
        swap(arr, index, start - 1);
        return start - 1;
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void quickSort(int[] arr, int start, int end) {
        if (start == end) {
            return;
        }
        int index = partition(arr, start, end);
        if (index > start) {
            quickSort(arr, 0, index - 1);
        }
        if (index < end) {
            quickSort(arr, index + 1, end);
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,4,1,2,5,6,6};
        new QuickSort().quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }


}
