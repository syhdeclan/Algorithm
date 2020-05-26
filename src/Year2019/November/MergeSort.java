package Year2019.November;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {1,6,3,5};
        System.out.println(Arrays.toString(arr));
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr, int L, int R) {
        if (L == R) {
            return;
        }
        int mid = L + (R - L >> 1);
        mergeSort(arr, L, mid);
        mergeSort(arr, mid + 1, R);
        merge(arr, L, mid, R);
    }

    public static void merge(int[] arr, int L, int mid, int R) {
        int[] res = new int[R - L + 1];
        int i = 0;
        int p1 = L;
        int p2 = mid + 1;
        while (p1 <= mid && p2 <= R) {
            res[i++] = arr[p1] < arr[p2] ? arr[p1++] : arr[p2++];
        }
        while (p1 <= mid) {
            res[i++] = arr[p1++];
        }
        while (p2 <= R) {
            res[i++] = arr[p2++];
        }
        for (int j = 0; j < res.length; j++) {
            arr[L + j] = res[j];
        }
    }


    public static int[] generateRandomArray(int size, int value) {
        int[] arr = new int[(int) ((size + 1) * Math.random())];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((value + 1) * Math.random() - (int) (value * Math.random()));
        }
        return arr;
    }

    public static void rightMethod(int[] arr) {
        Arrays.sort(arr);
    }

    public static int[] copyArr(int[] arr) {
        if (arr == null) {
            return null;
        }
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[i];
        }
        return res;
    }

    public static boolean isEqual(int[] arr1, int[] arr2) {
        if ((arr1 == null && arr2 != null) || (arr1 != null && arr2 == null)) {
            return false;
        }
        if (arr1 == null && arr2 == null) {
            return true;
        }
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }


}
