package Year2020.January;

import java.util.LinkedList;
import java.util.List;

/**
 * @author shenyvhao
 * @program Algorithm
 * @description
 * @create 2020-01-12 20
 **/


public class SumZero {

    public static void main(String[] args) {
        int[] arr = sumZero(5);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int[] sumZero(int n) {
        int arr[] = new int[n];
        int count = 0;
        List<Integer> list = new LinkedList();
        for (int k = 0; k < n; k++) {

            if (list.size() < n - 1) {
                int i = (int) (Math.random() * 1000);
                while (list.contains(i)) {
                    i = (int) (Math.random() * 1000);
                }
                list.add(i);
                arr[count++] = i;
            } else {
                int sum = 0;
                for (int i = 0; i < list.size(); i++) {
                    sum += list.get(i);
                }
                list.add(-sum);
                arr[count] = -sum;
            }
        }

        return arr;
    }

}

