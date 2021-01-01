package Single;

import java.util.Scanner;

/**
 * @author shenyvhao
 * @program Algorithm
 * @description
 * @create 2020-09-26 19
 **/


public class syh360_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int k = scanner.nextInt();
            int v = scanner.nextInt();
            int boxes = 0;

            a:
            while (a > 0) {
                while (b > 0) {
                    if (b >= k - 1) {
                        a -= k * v;
                        b -= k - 1;
                    } else {
                        a -= b * v;
                        b = 0;
                    }
                    boxes ++;
                    continue a;
                }
                a -= v;
                boxes ++;
            }
            System.out.println(boxes);
            scanner.nextLine();
        } while (scanner.hasNext());

    }


}
