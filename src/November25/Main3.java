package November25;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
//        int num = reader.nextInt();
        String row = reader.nextLine();
        int num = Integer.parseInt(row);
        for (int i = 0; i < num; i++) {
            while (reader.hasNext()) {
                String str = reader.nextLine();
                String[] arr = str.split(" ");
                int pass = Integer.parseInt(arr[1]);
                if (arr[0].equals("D")) {
                    System.out.println(decode(pass, arr[2]));
                } else if (arr[0].equals("E")) {
                    System.out.println(encode(pass, arr[2]));
                }
            }
        }

    }

    static String encode(int i, String str) {
        char[] arr = str.toCharArray();
        for (int j = 0; j < arr.length; j++) {
            arr[j] += i;
            if (arr[j] - i >= 'a' && arr[j] - i <= 'z') {
                if (arr[j] > 'z') {
                    arr[j] -= 26;
                }
            } else if (arr[i] - i >= 'A' && arr[j] - i <= 'Z') {
                if (arr[j] > 'Z') {
                    arr[j] -= 26;
                }
            }
        }
        return new String(arr);
    }

    static String decode(int i, String str) {
        char[] arr = str.toCharArray();
        for (int j = 0; j < arr.length; j++) {
            arr[j] -= i;
            if (arr[j] + i >= 'a' && arr[j] + i <= 'z') {
                if (arr[j] < 'a') {

                    arr[j] += 26;
                }
            } else if (arr[i] + i >= 'A' && arr[j] + i <= 'Z') {
                if (arr[j] < 'A') {

                    arr[j] += 26;
                }
            }
        }
        return new String(arr);
    }

}
