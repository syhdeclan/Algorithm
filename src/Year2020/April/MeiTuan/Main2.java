package Year2020.April.MeiTuan;

import java.util.*;

/**
 * @author shenyvhao
 * @program Algorithm
 * @description
 * @create 2020-04-09 19
 **/


public class Main2 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int num = reader.nextInt();
        reader.nextLine();
        int[] start = new int[num];
        for (int i = 0; i < num; i++) {
            start[i] = reader.nextInt();
        }
        reader.nextLine();
        int[] end = new int[num];
        for (int i = 0; i < num; i++) {
            end[i] = reader.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < num; i++) {
            int nowStart = start[i];
            int finalPos = indexOf(nowStart, end);
            Set<Integer> perAfter = new HashSet<>();
            for (int j = num - 1; j >= finalPos; j--) {
                perAfter.add(end[j]);
            }
            Set<Integer> perBefore = new HashSet<>();
            for (int j = num - 1; j >= nowStart; j--) {
                perBefore.add(start[j]);
            }
            perBefore.removeAll(perAfter);
            if (!perBefore.isEmpty()) {
                sum++;
            }
        }
        System.out.println(sum);


    }

    public static int indexOf(int target, int[] arr) {
        int num = arr.length;
        for (int i = 0; i < num; i++) {
            if (target == arr[i]) {
                return i;
            }
        }
        return -1;
    }

}
