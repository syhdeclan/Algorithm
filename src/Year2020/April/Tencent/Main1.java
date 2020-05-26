package Year2020.April.Tencent;

import java.util.Scanner;

/**
 * @author shenyvhao
 * @program Algorithm
 * @description
 * @create 2020-04-26 20
 **/


public class Main1 {

    public static void main(String[] args) {

//        Queue queue = new LinkedList();
        int[] queue = new int[1001];
        int head = 0;
        int tail = 0;
        int size = 0;
        Scanner reader = new Scanner(System.in);
        int t = reader.nextInt();
        reader.nextLine();
        for (int i = 0; i < t; i++) {
            int ops = reader.nextInt();
            reader.nextLine();
            for (int j = 0; j < ops; j++) {
                String operation = reader.nextLine();
                String str = operation.substring(0, 3);
                if (str.equals("PUS")) {
                    String numStr = operation.substring(5);
                    int num = Integer.parseInt(numStr);
                    queue[tail++] = num;
                    size ++;
                } else if (str.equals("TOP")) {
                    if (size == 0) {
                        System.out.println(-1);
                    } else {
                        System.out.println(queue[head]);
                    }
                } else if (str.equals("POP")) {
                    if (size == 0) {
                        System.out.println(-1);
                    } else {
                        queue[head++] = 0;
                        size--;
                    }
                } else if (str.equals("SIZ")) {
                    System.out.println(size);
                } else if (str.equals("CLE")) {
                    for (int k = 0; k < queue.length; k++) {
                        queue[k] = 0;
                    }
                } else {
                    System.out.println(11111);
                }
            }
        }

    }

}
