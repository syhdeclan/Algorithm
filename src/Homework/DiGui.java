package Homework;

import java.util.LinkedList;

public class DiGui {

    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList();
        for (int i = 0; i < 10; i++) {
            linkedList.add(i);
        }
        sout(linkedList, 0);
    }

    static int Jiecheng(int n) {
        if (n == 1) {
            return 1;
        } else
            return Jiecheng(n - 1) * n;
    }

    static int Fibonacci(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 1;
        } else {
            return Fibonacci(n - 1) + Fibonacci(n - 2);
        }
    }

    static void sout(LinkedList linkedList, int i) {
        if (i < linkedList.size()) {
            sout(linkedList, i + 1);
            System.out.println(linkedList.get(i));
        }
    }

}
