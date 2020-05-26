package November4;

import java.util.Arrays;
import java.util.Scanner;

public class Main1344 {
    //这道题提交上去不对
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num = reader.nextInt();
        reader.nextLine();
        for (int i = 0; i < num; i++) {
            String[] str = reader.nextLine().split(" ");

            int l1 = Integer.parseInt(str[0]);
            int l2 = Integer.parseInt(str[1]);

            int arr1[] = new int[l1];
            int arr2[] = new int[l2];
            String[] str1 = reader.nextLine().split(" ");
            for (int j = 0; j < arr1.length; j++) {

                arr1[j] = Integer.parseInt(str1[j]);
            }
            Arrays.sort(arr1);
            String[] str2 = reader.nextLine().split(" ");
            for (int j = 0; j < arr2.length; j++) {
                arr2[j] = Integer.parseInt(str2[j]);
            }
            Arrays.sort(arr2);

            int small1 = arr1[0];
            int small2 = arr2[0];
            if(small1 > small2){
                System.out.println(small2+""+small1);
            }else if (small1 < small2){
                System.out.println(small1+""+small2);
            }else {
                System.out.println(small1);
            }


        }


    }



}
