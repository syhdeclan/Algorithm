package Year2021.January;

import java.util.Arrays;

public class MergeSort {

    public void merge(int[] arr, int start, int mid, int end) {
        int[] temp = new int[arr.length];
        int i = start, j = mid + 1, k = start;
        while (i <= mid && j <= end){
            if (arr[i] < arr[j]){
                temp[k++] = arr[i++];
            }else {
                temp[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= end) {
            temp[k++] = arr[j++];
        }
        for (int l = start; l <= end; l++) {
            arr[l] = temp[l];
        }
    }

    public void mergeSort(int[] arr, int start, int end) {
        if (start < end) {
            int mid = start + (end - start) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 3, 2, 5, 14, 7, 4, 8, 1, 2};
        new MergeSort().mergeSort(arr,0,arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }


}
