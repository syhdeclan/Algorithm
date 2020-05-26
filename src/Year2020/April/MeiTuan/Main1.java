package Year2020.April.MeiTuan;

import java.util.Scanner;

/**
 * @author shenyvhao
 * @program Algorithm
 * @description
 * @create 2020-04-09 19
 **/


public class Main1 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int weekday = reader.nextInt();
        reader.nextLine();
        String time = reader.nextLine();
        int before = reader.nextInt();

        String[] timeArr = time.split(":");
        int hour = Integer.parseInt(timeArr[0]);
        int minute = Integer.parseInt(timeArr[1]);

        int newMin = minute - before % 60;

        int newHour = hour - before / 60;
        if (newMin < 0) {
            newMin += 60;
            newHour--;
        }
        int dayBefore = 0;
        while (newHour < 0) {
            newHour += 24;
            dayBefore++;
        }
        int newWeek = weekday - dayBefore;
        if (newHour == 24) {
            newHour = 0;
            newWeek++;
        }
        String nowHour = newHour + "";
        String nowMin = newMin + "";
        if (newHour < 10) {
            nowHour = "0" + newHour;
        }
        if (newMin < 10) {
            nowMin = "0" + newMin;
        }
        while (newWeek <= 0) {
            newWeek += 7;
        }
        System.out.println(newWeek);
        System.out.println(nowHour + ":" + nowMin);

    }

}
