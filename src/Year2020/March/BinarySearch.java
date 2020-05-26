package Year2020.March;

import java.util.HashMap;

/**
 * @author shenyvhao
 * @program Algorithm
 * @description
 * @create 2020-03-20 10
 **/


public class BinarySearch {

    /**
     * 递归法
     */
    public static int binarySearch(int[] arr, int key, int low, int high) {
        if (key < arr[low] || key > arr[high] || low > high) {
            return -1;
        }
        int middle = low + (high - low) / 2;
        if (arr[middle] > key) {
            return binarySearch(arr, key, low, middle - 1);
        } else if (arr[middle] < key) {
            return binarySearch(arr, key, middle + 1, high);
        } else {
            return middle;
        }
    }

    /**
     * 非递归
     */
    public static int binarySearch2(int[] arr, int key, int low, int high){
        if (key < arr[low] || key > arr[high] || low > high) {
            return -1;
        }
        int middle = 0;
        while (low <= high){
            middle = low + (high - low) / 2;
            if (arr[middle] > key){
                high = middle - 1;
            }else if (arr[middle] < key){
                low = middle + 1;
            }else{
                return middle;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 8, 10, 15};
        System.out.println(binarySearch2(arr, 15, 0, arr.length - 1));
    }

}
