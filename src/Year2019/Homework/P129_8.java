package Year2019.Homework;

import java.util.Arrays;

public class P129_8 {

    public static void main(String[] args) {

        int total = 111;
        int[] size = {1,2,5,10};
        int[] count = new int[size.length];
        for (int i = size.length - 1; i >= 0; i--) {
            count[i] = total/size[i];
            total = total%size[i];
        }
        System.out.println(Arrays.toString(count));
    }




}
