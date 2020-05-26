package December1;

import java.math.BigInteger;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num = reader.nextInt();
        reader.nextLine();
        for (int i = 0; i < num; i++) {
            String str = reader.nextLine();
            String[] strs = str.split(" ");
            BigInteger num1 = new BigInteger(strs[0]);
            BigInteger num2 = new BigInteger(strs[1]);
            BigInteger num3 = new BigInteger(strs[2]);

            if (num1.add(num2).compareTo(num3) == 1){
                System.out.println("Case #"+(i+1)+": true");
            }else {
                System.out.println("Case #"+(i+1)+": false");
            }
        }

    }

}
