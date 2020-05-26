package Year2020.March;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author shenyvhao
 * @program Algorithm
 * @description
 * @create 2020-03-21 22
 **/


public class GetLeastNumbers {

    public int[] getLeastNumbers(int[] arr, int k) {
        Arrays.sort(arr);
        Queue<Integer> heap = new PriorityQueue<Integer>(3,(i1,i2) -> Integer.compare(i2,i1));
        return Arrays.copyOf(arr, k);

    }


}
