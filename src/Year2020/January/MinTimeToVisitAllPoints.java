package Year2020.January;

/**
 * @author shenyvhao
 * @program Algorithm
 * @description
 * @create 2020-01-12 20
 **/


public class MinTimeToVisitAllPoints {

    public int minTimeToVisitAllPoints(int[][] points) {
        int nowX = points[0][0];
        int nowY = points[0][1];
        int sum = 0;
        for (int i = 1; i < points.length; i++) {
            sum += Math.max(Math.abs(nowX -points[i][0]),Math.abs(nowY - points[i][1]));
        }
        return sum;
    }


    public static void main(String[] args) {

    }

}
