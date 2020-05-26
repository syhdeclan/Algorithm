package Year2020.April;

/**
 * @author shenyvhao
 * @program Algorithm
 * @description
 * @create 2020-04-01 19
 **/


public class CountBits {

    //    public int[] countBits(int num) {
//        int[] arr = new int[num + 1];
//        for (int i = 0; i <= num; i++) {
//            arr[i] = countBit(i);
//        }
//        return arr;
//    }
//
//    public int countBit(int i) {
//        int sum = 0;
//        while (i != 0) {
//            if ((i & 1) == 1) {
//                sum++;
//            }
//            i >>= 1;
//        }
//        return sum;
//    }

    public int[] countBits(int num) {
        int[] arr = new int[num + 1];
        arr[0] = 0;
        for (int i = 1; i <= num; i++) {
            arr[i] = arr[i >> 1] + (i & 1);
        }
        return arr;
    }

}

