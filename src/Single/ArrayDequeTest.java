package Single;

import java.util.ArrayDeque;

/**
 * @author shenyvhao
 * @program Algorithm
 * @description
 * @create 2020-07-12 23
 **/


public class ArrayDequeTest {

    public static void main(String[] args) {

        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.push(1);
        arrayDeque.push(2);
        arrayDeque.push(3);
        System.out.println(arrayDeque.pop());
        System.out.println(arrayDeque.pop());
        System.out.println(arrayDeque.pop());

    }



}
