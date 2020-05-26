package Single;

import java.util.Arrays;
import java.util.Scanner;

public class October28_2 {

    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        int days = reader.nextInt();
        int time = reader.nextInt();
        int theDay = 0;
        reader.nextLine();
        int[] dayTime = new int[days];
        for (int i = 0; i < dayTime.length; i++) {
           dayTime[i] = reader.nextInt();
           int left = 86400 - dayTime[i];
           time -= left;
           if(time <=0) {
               theDay = i + 1;
           }
        }
        System.out.println(theDay);

    }


}
