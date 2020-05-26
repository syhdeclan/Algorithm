package Year2019.Homework;

import java.util.Arrays;
public class FindMax {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 1, 2, 3, 7};
        System.out.println(Arrays.toString(getMaxes(arr, 0, arr.length - 1)));
    }

    public static int[] getMaxes(int[] arr, int low, int high) {
        int[] ret = new int[2];
        if (high - low == 0) {
            ret[0] = arr[low];
        } else if (high - low == 1) {
            ret[0] = Math.max(arr[low], arr[high]);
            ret[1] = Math.min(arr[low], arr[high]);
        } else {
            int mid = low + (high - low) / 2;
            int[] ret1 = getMaxes(arr, low, mid);
            int[] ret2 = getMaxes(arr, mid + 1, high);
            if (ret1[0] > ret2[0]) {
                ret[0] = ret1[0];
                ret[1] = Math.max(ret1[1], ret2[0]);
            } else {
                ret[0] = ret2[0];
                ret[1] = Math.max(ret1[0], ret2[1]);
            }
        }
        return ret;
    }
}
