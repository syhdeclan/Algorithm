package January19;

import java.util.Scanner;

public class Main1 {

    static String[] oneWin = {"C J", "J B", "B C"};
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num = reader.nextInt();


        int oneWinNum = 0, onePingNum = 0, oneLoseNum = 0;
        int C = 0, J = 0, B = 0;

        for (int i = 0; i < num; i++) {
            String line = reader.nextLine();
            char first = line.charAt(0);
            char second = line.charAt(2);
            int iswin = isWin(line);
            if (first == second) {
                onePingNum += 1;
            }else if(isWin(line) > -1){
                if (iswin == 0){

                }


                oneWinNum += 1;
            }

        }

    }

    static int isWin(String str){
        for (int i = 0; i < oneWin.length; i++) {
            if (oneWin[i].equals(str)){
                return i;
            }
        }
        return -1;

    }

}
