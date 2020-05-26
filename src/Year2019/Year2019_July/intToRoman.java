package Year2019.Year2019_July;

import java.util.Scanner;

public class intToRoman {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int num = reader.nextInt();

//        Map<Integer,String> map = new HashMap<>();
//        map.put(1,"I");
//        map.put(5,"V");
//        map.put(10,"X");
//        map.put(50,"L");
//        map.put(100,"C");
//        map.put(500,"D");
//        map.put(1000,"M");
//
//        Set<Integer> keySet = map.keySet();
//        Integer[] keys = (Integer[]) keySet.toArray();

        int[] keys = {1, 5, 10, 50, 100, 500, 1000};
        String[] values = {"I", "V", "X", "L", "C", "D", "M"};
        String tar = "";
        String tarBefore = "";

        for (int i = keys.length - 1; i >= 0; i--) {
            if (num / keys[i] != 0) {
                int time = num/keys[i];
//                if (time == 4){
//
//                }
                tarBefore = tar;
                for (int j = 0; j < time; j++) {
                    num -= keys[i];
                    tar += values[i];
                }
            }
        }

        System.out.println(tar);


    }

}
