package Year2019.November;

import java.util.Arrays;

/**
 * @program Algorithm
 * @description QuickSort by myself
 * @author shenyvhao
 * @create 2019-11-28 21
 **/


public class QuickSort {

    public static void main(String[] args) {
        int arr[] = {1, 7, 5, 3, 6, 2, 9, 8, 3};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int start, int end) {
        //这个条件没想出来
        if (start < end) {
            int[] a = partition(arr, start, end);
            //遍历边界值没找出来
            quickSort(arr, start, a[0] - 1);
            quickSort(arr, a[1] + 1, end);
        }
    }

    /**
     * 具体的排序内容
     *
     * @return
     */
    public static int[] partition(int[] arr, int L, int R) {
        int less = L - 1;
        int more = R + 1;
        int num = arr[R];
        int p = L;
        while (p < more) {
            if (arr[p] < num) {
                swap(arr, p++, less++ + 1);
            } else if (arr[p] > num) {
                swap(arr, p, more-- - 1);
            } else {
                p++;
            }
        }
        return new int[]{less + 1, more - 1};
    }

    public static void swap(int[] arr, int index, int num) {
        int tmp = arr[index];
        arr[index] = arr[num];
        arr[num] = tmp;
    }

}
