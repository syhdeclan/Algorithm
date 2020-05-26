package Year2020.April.UnSolved;

import java.util.Scanner;

/**
 * @author shenyvhao
 * @program Algorithm
 * @description
 * @create 2020-04-08 16
 **/


public class AliBaba1 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num = reader.nextInt();
        for (int i = 0; i < num; i++) {
            int time = reader.nextInt();
            int count = reader.nextInt();
            int blood = reader.nextInt();
            int range = reader.nextInt();

            int leftBlood = count * blood;
            while (time > 0) {
                if (range > count) {
                    leftBlood -= count;
                }else{
                    leftBlood -= range;
                }
                time--;
            }

            if (leftBlood < 0) {
                System.out.println(count);
            } else {
                int left = leftBlood / blood;
                if (leftBlood % blood != 0) {
                    left += 1;
                }
                int sumDead = count - left;
                System.out.println(sumDead);
            }
        }


    }


}
