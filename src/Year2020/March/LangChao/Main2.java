package Year2020.March.LangChao;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        int up[] = new int[50];
        int down[] = new int[50];
        int start1 = 1, start2 = 2;
        for (int i = 0; i < 50; i++) {
            up[i] = start1 + i * 2;
            down[i] = start2 + i * 2;
        }

        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        reader.nextLine();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = reader.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if ((arr[i] & 1) == 0) {
                //偶数
                down[(arr[i] >> 1) - 1] = 0;
            } else {
                up[arr[i] >> 1] = 0;
            }
        }

        int start = 0;
        int count = 0;
        int maxStart = 0;
        int maxCount = 0;
        for (int i = 0; i < 50; i++) {
            if (up[i] != 0) {
                if (up[i] == 0) {
                    start = up[i];
                }
                count++;
                if (count > maxCount) {
                    maxCount = count;
                    maxStart = start;
                }
            } else {
                if (i != 49) {
                    start = up[i + 1];
                } else {
                    start = 0;
                }
                count = 0;
            }
        }

        for (int i = 0; i < 50; i++) {
            if (down[i] != 0) {
                if (down[i] == 0) {
                    start = down[i];
                }
                count++;
                if (count > maxCount) {
                    maxCount = count;
                    maxStart = start;
                }
            } else {
                if (i != 49) {
                    start = down[i + 1];
                } else {
                    start = 0;
                }
                count = 0;
            }
        }

        System.out.println(maxStart + " " + maxCount);


    }

}
