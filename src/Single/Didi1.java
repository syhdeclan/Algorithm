package Single;

import java.util.Scanner;

/**
 * @author shenyvhao
 * @program Algorithm
 * @description
 * @create 2020-09-13 19
 **/


public class Didi1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        scanner.nextLine();
        String str = scanner.nextLine();
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < str.length(); i += x) {
            StringBuilder sb = null;
            if (i + x > str.length()) {
                sb = new StringBuilder(str.substring(i));
            } else {
                sb = new StringBuilder(str.substring(i, i + x));
            }
            sb.reverse();
            res.append(sb);
        }
        System.out.println(res.toString());
    }


}
