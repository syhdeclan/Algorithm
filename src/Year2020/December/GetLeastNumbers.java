package Year2020.December;

/**
 * @author shenyvhao
 * @program Algorithm
 * @description
 * @create 2020-12-27 21
 **/


public class GetLeastNumbers {

    public int partition(int[] arr, int start, int end) {
        int index = start++;
        while (start < end) {
            while (arr[start] < arr[index] && start < end) {
                start++;
            }
            while (arr[end] > arr[index] && start < end) {
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

    public void getLeastNumbers(int[] arr, int k) {
        int start = 0, end = arr.length - 1;
        int index = partition(arr, start, end);
        while (index != k) {
            if (index > k) {
                end = index - 1;
                index = partition(arr, start, end);
            }
            if (index < k) {
                start = index + 1;
                index = partition(arr, start, end);
            }
        }
        for (int i = 0; i < k; i++) {
            System.out.println(arr[i]);
        }


    }

    public static void main(String[] args) {
        int[] arr = {2,4,5,1,3,7,6};
        new GetLeastNumbers().getLeastNumbers(arr,5);
    }


}
