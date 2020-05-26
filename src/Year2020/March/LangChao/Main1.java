package Year2020.March.LangChao;

/**
 * @author shenyvhao
 * @program Algorithm
 * @description
 * @create 2020-03-31 16
 **/

import java.util.Scanner;


public class Main1 {

    public static void main(String[] args) {
        int num = 1, maxr = 1;
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        reader.nextLine();
        int r[] = new int[n];
        System.out.println(1);
        System.out.println(1);
        int r1[] = new int[n];
        for (int i = 0; i < n; i++) {
            r[i] = reader.nextInt();
        }
        for (int i = 0; i < n; i++) {
            r1[i] = r[i];
            for (int j = i + 1; j < n; j++) {
                r1[j] = r[j];
                //判断相邻两数字是否递增1
                if (r1[i] + 1 == r1[j])
                {
                    //递增1子序列的长度
                    num = num + 1;
                    r1[i] = r1[j];
                }
            }
            //更新递增1子序列的长度
            if (num > maxr)
            {
                maxr = num;
            }
            num = 1;
        }
        System.out.println( n - maxr);
    }
}
