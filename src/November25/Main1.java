package November25;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num = reader.nextInt();
        reader.nextLine();
        int sum = 0;
        for (int i = 0; i < num; i++) {
            int now = reader.nextInt();
            reader.nextLine();
            for (int j = 1; j <= now; j++) {
                if (!isSeven(j)) {
                    sum += (j * j);
                }
            }
            System.out.println(sum);
            sum = 0;
        }
    }

    static boolean isSeven(int i) {
        if (i % 7 == 0 || (i + "").contains("7")) {
            return true;
        }
        return false;
    }


}
