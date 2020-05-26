package Year2020.March.Baidu;


import java.util.Arrays;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        reader.nextLine();
        int[] arr = new int[n];
        int a = 0;
        while (reader.hasNextInt()) {
            arr[a] = reader.nextInt();
            a++;
            if (a == n) {
                break;
            }
        }
        Arrays.sort(arr);
        int time = 0;
        while (arr[n - 1] >= n) {
            arr[n - 1] -= n;
            for (int i = 0; i < n - 1; i++) {
                arr[i] ++ ;
            }
            Arrays.sort(arr);
            System.out.println(Arrays.toString(arr));
            time ++;
        }

        System.out.println(time);
    }
}
