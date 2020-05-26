package Single;

import java.util.Scanner;

public class October28_3 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int length = reader.nextInt();
        reader.nextLine();
        String number = reader.nextLine();
        char[] num = number.toCharArray();
        char[] newNum = new char[length];
        for (int i = 0; i < newNum.length; i++) {
            newNum[i] = num[length-i-1];
        }
        String newNumber = new String(newNum);
        System.out.println(newNumber);
    }


}
