package Year2019.Year2019_April;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class StringStatistics {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int min = scanner.nextInt();
        scanner.nextLine();
        String target = scanner.nextLine();

        List<String> strs = new LinkedList<>();
        List<Integer> times = new LinkedList<>();

        for (int i = min; i < target.length(); i++) {
            for (int j = 0; j < target.length()-i; j++) {
                String now = target.substring(j,j+i);
                if (strs.indexOf(now)!= -1){
                    int old = times.get(strs.indexOf(now));
                    times.set(strs.indexOf(now),old+1);
                }else {
                    strs.add(now);
                    times.add(1);
                }
            }
        }

        int biggest = 0;
        int index = 0;
        int length = 0;
        int firstIndex = 0;
//
//        for (int i = 0; i < times.size(); i++) {
//            System.out.print(strs.get(i)+ " ");
//            System.out.print(times.get(i));
//            System.out.println();
//        }


        for (int i = 0 ; i < times.size(); i++) {
             if (times.get(i) >= biggest){
                 biggest = times.get(i);
                 index = i;
                 length = strs.get(i).length();
                 if (strs.get(i).length() != length){
                     firstIndex = index;
                 }
             }
        }
        if (times.get(index) > times.get(firstIndex)){
            System.out.println(strs.get(index));
        }else{
            System.out.println(strs.get(firstIndex));
        }

    }

}
