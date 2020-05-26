package Year2020.April;

/**
 * @author shenyvhao
 * @program Algorithm
 * @description
 * @create 2020-04-07 19
 **/


public class Rotate {

    public void rotate(int[][] matrix) {
        int len = matrix[0].length - 1;
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len - i; j++) {
                swap(j, i, len - i, j, matrix);
                swap(len - i, j, len - j, len - i, matrix);
                swap(len - j, len - i, i, len - j, matrix);
            }
        }

    }

    public void swap(int x1, int y1, int x2, int y2, int[][] matrix) {
        int temp = matrix[x1][y1];
        matrix[x1][y1] = matrix[x2][y2];
        matrix[x2][y2] = temp;
    }

    public static void main(String[] args) {
        new Rotate().rotate(new int[][]{{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}});
    }

}
