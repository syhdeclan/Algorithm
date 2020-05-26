package Year2020.March.Baidu;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main2_2 {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        reader.nextLine();
        int[] arr = new int[n];
        int a = 0;
        while (reader.hasNextInt()){
            arr[a++] = reader.nextInt();
        }
        Arrays.sort(arr);
        int time = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(arr[i]);
        }
        while(list.get(list.size() - 1) >= n){
            list.remove(list.size() - 1);
            for (int i = 0; i < list.size(); i++) {
                Integer b = list.get(i) + 1;
                list.set(i,b);
            }
            time ++;
        }
        System.out.println(time);

    }

}
