package Year2020.April.Tencent;

import java.util.Scanner;

/**
 * @author shenyvhao
 * @program Algorithm
 * @description
 * @create 2020-04-26 21
 **/


public class Main5 {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int nums = reader.nextInt();
        reader.nextLine();
        for (int i = 0; i < nums; i++) {
            long son = reader.nextLong();
            int ancestor = reader.nextInt();
            if (i != nums - 1) {
                reader.nextLine();
            }
            int height = getHeight(son);
            int dis = height - ancestor;
            if (dis <= 0) {
                System.out.println(-1);
                continue;
            }
            for (int j = 0; j < dis; j++) {
                son = son >> 1;
            }
            System.out.println(son);
        }


    }
    public static int getHeight(long pos){
        int height = 1;
        while (pos != 1) {
            pos = pos >> 1;
            height ++;
        }
        return height;
    }

}
