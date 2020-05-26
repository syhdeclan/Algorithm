package Year2019.Homework;

import java.util.LinkedList;
import java.util.List;

public class P129_6 {

    public static void main(String[] args) {
        int distance = 7;
        int arr[] = {2, 7, 3, 6, 13, 14, 15};
        int nowPlace = 0;
        //加油的站点索引
        List<Integer> add = new LinkedList();
        for (int i = 0; i < arr.length; i++) {
            int max = 0;
            if (nowPlace + distance > arr[i]) {
                if (nowPlace + distance - arr[i] > max) {
                    add.add(i);
                }
            }

        }
        System.out.println(add.toString());


    }

}
