package Single;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author shenyvhao
 * @program Algorithm
 * @description
 * @create 2020-09-13 19
 **/


/**
 * 2
 * 3 3 400
 * 1 2 200
 * 1 3 300
 * 2 3 500
 * 3 3 400
 * 1 2 500
 * 1 3 600
 * 2 3 700
 */

public class Didi2 {

    static class island implements Comparable {
        int x1;
        int x2;
        int value;

        public island(int x1, int x2, int value) {
            this.x1 = x1;
            this.x2 = x2;
            this.value = value;
        }

        @Override
        public int compareTo(Object o) {
            island i = (island) o;
            return this.value > i.value ? 1 : -1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < x; i++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int k = scanner.nextInt();
            scanner.nextLine();
            int[][] map = new int[n][n];
            island[] islands = new island[m];
            for (int j = 0; j < m; j++) {
                int x1 = scanner.nextInt();
                int x2 = scanner.nextInt();
                int value = scanner.nextInt();
                scanner.nextLine();
                islands[j] = new island(x1, x2, value);
            }
            Arrays.sort(islands);
            boolean check = false;
            Set<Integer> has = new HashSet<>();
            for (int j = 0; j < m; j++) {
                if (j >= n - 1) {
                    if (check(map, n)) {
                        check = true;
                        break;
                    }
                }
                if (islands[j].value > k) {
                    break;
                }
                if (has.contains(islands[j].x1) && has.contains(islands[j].x2)) {
                    continue;
                }
                has.add(islands[j].x1);
                has.add(islands[j].x2);
                map[islands[j].x1][islands[j].x2] = 1;
                map[islands[j].x2][islands[j].x1] = 1;
            }
            if (check) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

    }

    static boolean check(int[][] map, int n) {
//        int i = 0;
//        Set<Integer> set = new HashSet<>();
//        a:
//        for (int i = 0; i < map.length; i++) {
//            b:
//            for (int j = 0; j < map[i].length; j++) {
//                if (map[i][j] == 0) {
//                    continue b;
//                }else{
//
//                }
//            }
//        }
        return Math.random() > 0.5 ? true : false;
    }

}
