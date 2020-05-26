package Year2019.November;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 3, 7, 5, 2};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr,arr.length);
        System.out.println(Arrays.toString(arr));

    }

    public static void bubbleSort(int[] arr, int end) {

        for (int i = end - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j + 1] < arr[j]) {
                    arr[j] = arr[j] ^ arr[j+1];
                    arr[j + 1] = arr[j] ^ arr[j+1];
                    arr[j] = arr[j] ^ arr[j+1];
                }
            }
        }
    }

}
