package Year2020.March.Thread;

import java.util.Scanner;

/**
 * @author shenyvhao
 * @program Algorithm
 * @description
 * @create 2020-03-27 17
 **/


public class Test2 {

    static class Share {

        int num = 0;

        public synchronized int add(){
            return ++num;
        }
    }

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int num = sca.nextInt();

        for(int i = 0;i<num;i++) {
            int a = sca.nextInt();
            int b = sca.nextInt();
            System.out.println(a+b);
        }


    }

}
