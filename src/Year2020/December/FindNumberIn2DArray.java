package Year2020.December;

/**
 * @author shenyvhao
 * @program Algorithm
 * @description
 * @create 2020-12-24 23
 **/


public class FindNumberIn2DArray {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        a:
        for (int i = matrix.length - 1; i >= 0; i--) {
            b:
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == target) {
                    return true;
                }
                if (matrix[i][j] < target) {
                    continue a;
                }
                if (matrix[i][j] > target) {
                    continue b;
                }
            }
        }
        return false;

    }


}
