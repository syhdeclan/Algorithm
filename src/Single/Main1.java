package Single;

import java.util.Scanner;

/**
 * @author shenyvhao
 * @program Algorithm
 * @description
 * @create 2020-09-03 19
 **/


public class Main1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.nextLine();
        //组数
        for (int i = 0; i < x; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] arr = new int[n];
            sc.nextLine();
            //特性
            for (int j = 0; j < m; j++) {
                int t = sc.nextInt();
                sc.nextLine();
                //区间数
                for (int k = 0; k < t; k++) {
                    int start = sc.nextInt();
                    int end = sc.nextInt();
                    for (int l = start - 1; l <= end - 1; l++) {
                        arr[l] ++;
                    }
                }
            }
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == m){
                    count++;
                }
            }
            System.out.println(count);
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == m) {
                    System.out.print((j + 1) + " ");
                }
            }
        }
        
    }
}
