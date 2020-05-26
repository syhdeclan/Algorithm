package Year2020.April.MeiTuan;

import java.util.Scanner;

/**
 * @author shenyvhao
 * @program Algorithm
 * @description
 * @create 2020-04-09 20
 **/


public class Main3 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num = reader.nextInt();
        int k = reader.nextInt();

        int i = 1;
        a:
        while (true) {
            int x = i * k;
            int sum = 0;
            while ((x / k) > 1) {
                x /= k;
                sum += x;
                if (sum >= num) {
                    System.out.println(i);
                    break a;
                }
            }
            i++;
        }

    }


}
