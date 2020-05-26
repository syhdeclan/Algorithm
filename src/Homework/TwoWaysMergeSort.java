package Homework;

import java.util.List;

public class TwoWaysMergeSort {

    public static void main(String[] args) {

        int[] arr = {7, 3, 6, 5, 1, 21, 2, 4};

        // 调用归并算法
        int[] res = Sort(arr, 0, arr.length - 1);

        printArr(res);

    }

    static void printArr(int[] res) {
        System.out.println("====================");
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + "  ");
        }
        System.out.println();
        System.out.println("++++++++++++++++++++");
    }

    static int[] Sort(int[] arr, int low, int high) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;
        printArr(arr);
        int[] left = Sort(arrCopy(arr, 0, mid), low, mid);
        System.out.println("left");
        printArr(left);
        int[] right = Sort(arrCopy(arr, mid, arr.length), mid + 1, high);
        System.out.println("right");
        printArr(right);
        return merge(left, right);
    }

    static int[] arrCopy(int[] arr, int start, int end) {
        if (arr.length == 1) {
            return arr;
        }
        int res[] = new int[end - start];
        for (int i = start, a = 0; i < end; i++, a++) {
            res[a] = arr[i];
        }
        return res;
    }

    static int[] merge(int[] left, int[] right) {
        int leftIndex = 0, rightIndex = 0;
        int[] res = new int[(left.length + right.length)];
        int i;
        for (i = 0; i < left.length + right.length; i++) {
            if ((left.length > i && right.length > i)){
                if (left[leftIndex] <= right[rightIndex]) {
                    res[i] = left[leftIndex];
                    leftIndex++;
                }
                if (left[leftIndex] > right[rightIndex]) {
                    res[i] = right[rightIndex];
                    rightIndex++;
                }
            }
        }

        while(leftIndex < left.length -1){
            res[i++] = left[leftIndex++];
        }

        while(rightIndex< right.length -1){
            res[i++] = right[rightIndex++];
        }

        return res;
    }
}
