package Year2019.Year2019_March;

import java.util.Scanner;

//算法提高 超级玛丽
public class Main2 {

    static int ways = 0;

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int total = reader.nextInt();
        int[] map = new int[total];
        int trap = reader.nextInt();
        reader.nextLine();
        for (int i = 0; i < total; i++) {
            map[i] = 0;
        }
        for (int i = 0; i < trap; i++) {
            int one = reader.nextInt();
            if(one < map.length){
                map[one - 1] = 1;
            }
        }

        nextStep(0, map);

        System.out.println(ways);


    }

    public static void nextStep(int nowIndex, int[] map) {

        int length = map.length;

        if (nowIndex == length - 1) {
            ++ways;
        }

        if ((nowIndex + 1 < length && map[nowIndex + 1] == 1) && (nowIndex + 2 < length && map[nowIndex + 2] == 1)) {
            return;
        }
        if (nowIndex + 1 < length && map[nowIndex + 1] == 0) {
            nextStep(nowIndex + 1, map);
        }
        if (nowIndex + 2 < length && map[nowIndex + 2] == 0) {
            nextStep(nowIndex + 2, map);
        }

    }

}
