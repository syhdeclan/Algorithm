package Year2020.April;

/**
 * @author shenyvhao
 * @program Algorithm
 * @description
 * @create 2020-04-25 20
 **/


public class NumArray {

//    int[][] f;
//
//    public NumArray(int[] nums) {
//        int n = nums.length;
//        if (n == 0) {
//            return;
//        }
//        f = new int[n][n];
//
//        f[0][0] = nums[0];
//        for (int i = 0; i < n; i++) {
//            for (int j = i; j < n; j++) {
//                if (j > 0) {
//                    f[i][j] = f[i][j - 1] + nums[j];
//                }
//            }
//        }
//    }
//
//    public int sumRange(int i, int j) {
//        return f[i][j];
//    }

    private int[] sum;

    public NumArray(int[] nums) {
        sum = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            sum[i + 1] = sum[i] + nums[i];
        }
    }

    public int sumRange(int i, int j) {
        return sum[j + 1] - sum[i];
    }

}
