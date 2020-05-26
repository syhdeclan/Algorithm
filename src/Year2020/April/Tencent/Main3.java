package Year2020.April.Tencent;

import java.util.Scanner;

/**
 * @author shenyvhao
 * @program Algorithm
 * @description
 * @create 2020-04-26 20
 **/


public class Main3 {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int nums = reader.nextInt();
        int[] up = new int[nums];
        int[] down = new int[nums];

        reader.nextLine();
        for (int i = 0; i < nums; i++) {
            up[i] = reader.nextInt();
        }
        reader.nextLine();
        for (int i = 0; i < nums; i++) {
            down[i] = reader.nextInt();
        }

        int times = 0;
        int count = 0;
        while (count < 100) {
            for (int i = 0; i < nums - 1; i++) {
                if (up[i] > up[i + 1]) {
                    swap(i, i + 1, up);
                    swap(i, i + 1, down);
                    swap(i, up, down);
                    swap(i + 1, up, down);
                    times ++;
                }
            }
            count ++;
        }
        System.out.println(times);

    }

    public static void swap(int a, int b, int[] arr) {
        int t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }

    public static void swap(int i, int[] arr1, int[] arr2) {
        int t = arr1[i];
        arr1[i] = arr2[i];
        arr2[i] = t;
    }


}
