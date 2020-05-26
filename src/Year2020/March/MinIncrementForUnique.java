package Year2020.March;

import java.util.Arrays;

/**
 * @author shenyvhao
 * @program Algorithm
 * @description
 * @create 2020-03-22 21
 **/


public class MinIncrementForUnique {

    public int minIncrementForUnique(int[] A) {
        Arrays.sort(A);
        int sum = 0;
        for (int i = 1; i < A.length; i++) {
            if (A[i] <= A[i -1]){
                int dis = A[i - 1] - A[i] + 1;
                sum += dis;
                A[i] = A[i - 1] + 1;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(new MinIncrementForUnique().minIncrementForUnique(new int[]{3,2,1,2,1,7}));
    }

}
