package Single;

/**
 * @author shenyvhao
 * @program Algorithm
 * @description
 * @create 2020-09-03 20
 **/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.nextLine();
        int fiveCount = 0;
        int zeroCount = 0;
        for (int i = 0; i < x; i++) {
            if (sc.nextInt() == 5) {
                fiveCount++;
            } else {
                zeroCount++;
            }
        }

        int n = fiveCount / 9;
        String num = "";
        for (int i = 0; i < n; i++) {
            num += "555555555";
        }
        if (n == 0) {
            if (zeroCount == 0) {
                System.out.println(-1);
            }else {
                System.out.println(0);
            }
        } else {
            for (int i = 0; i < zeroCount; i++) {
                num += "0";
            }
            System.out.println(num);
        }
    }
}