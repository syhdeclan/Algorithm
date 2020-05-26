package Year2020.April.MeiTuan;

import java.util.Scanner;

/**
 * @author shenyvhao
 * @program Algorithm
 * @description
 * @create 2020-04-09 20
 **/


public class Main4 {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int num = reader.nextInt();
        int arr[] = new int[num];
        if (num == 0) {
            System.out.println(0);
        } else if (num == 1) {
            System.out.println(0);
        } else if (num == 2) {
            System.out.println(3);
        } else if (num == 3) {
            System.out.println(6);
        }else{
            arr[0] = 0;
            arr[1] = 0;
            arr[2] = 3;
            for (int i = 3; i < num; i++) {
                arr[i] = 3 + arr[i - 1];
            }
            System.out.println(arr[num]);
        }
    }

}
