package Year2019.Homework;

public class P73_14 {

    /**
     * 这道题不会
     *
     * @param args
     */
    public static void main(String[] args) {

        int k = 1, x = 1, y = 1;
        for (; k <= 50; k++) {
            x = 2 * k;
            y = 2 * k;
            while (x >= y) {
                if (x * y == k * (x + y)) {
                    System.out.println("x=" + x + "   y=" + y + "   k=" + k);
                    x++;
                }
                y--;
                if (y <= 0) {
                    y = 2 * k - 1;
                    x++;
                }
                if (x >= k * k * k) {
                    break;
                }
            }
            k++;
        }

    }

}
