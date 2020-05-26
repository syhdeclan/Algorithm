package Year2020.March;

/**
 * @author shenyvhao
 * @program Algorithm
 * @description
 * @create 2020-03-18 10
 **/


public class IsRectangleOverlap {

    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {

        //1的左下角
        int x1 = rec1[0];
        int y1 = rec1[1];
        //2的右上角
        int x2 = rec2[2];
        int y2 = rec2[3];
        //1的右上角
        int x3 = rec1[2];
        int y3 = rec1[3];
        //2的左下角
        int x4 = rec2[0];
        int y4 = rec2[1];

        if (x1 < x2 && y1 < y2 && x3 > x4 && y3 > y4 ){
            return true;
        }

        return false;
    }

}
