package Year2020.May;

/**
 * @author shenyvhao
 * @program Algorithm
 * @description
 * @create 2020-05-01 22
 **/


public class FindNumberIn2DArray {

    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int n = matrix.length;
        int m = matrix[0].length;
        int maxM = m - 1;
        int maxN = n - 1;
        for (int i = 0; i < m; i++) {
            if (matrix[0][i] >= target) {
                maxM = i;
                break;
            }
        }
        for (int i = 0; i < n; i++) {
            if (matrix[i][0] >= target) {
                maxN = i;
                break;
            }
        }
        for (int i = maxN; i >= 0; i--) {
            for (int j = maxM; j >= 0; j--) {
                if (matrix[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new FindNumberIn2DArray().findNumberIn2DArray(new int[][]{{1, 4}, {2, 5}}, 5));
    }


}
