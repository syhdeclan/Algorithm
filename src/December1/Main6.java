package December1;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String str = reader.nextLine();
        String[] strs = str.split(" ");

        String num1 = "", num2 = "";
        for (int i = 0; i < strs[0].length(); i++) {
            if (strs[0].charAt(i) == strs[1].charAt(0)) {
                num1 += strs[1];
            }
        }
        for (int i = 0; i < strs[2].length(); i++) {
            if (strs[2].charAt(i) == strs[3].charAt(0)) {
                num2 += strs[3];
            }
        }
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);

        int sum = n1+n2;
        System.out.println(sum);
    }


}
