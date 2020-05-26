package Year2020.April;

/**
 * @author shenyvhao
 * @program Algorithm
 * @description
 * @create 2020-04-08 19
 **/


public class MovingCount {

    public int movingCount(int m, int n, int k) {

        int count = 0;
        int innerJ = n - 1;
        a:
        for (int i = 0; i < m; i++) {
            b:
            for (int j = innerJ; j >= 0; j--) {
                int sum = i % 10 + i / 10 + j % 10 + j / 10;
                if (i == 100) {
                    sum -= 9;
                }
                if (j == 100) {
                    sum -= 9;
                }
                if (sum > k) {
                    continue b;
                } else if (sum == k) {
                    count += j + 1;
                    if (m == 1) {
                        return count;
                    }
                    return (count + 1) * count /2;
//                    innerJ = j;
//                    continue a;
                } else {
//                    count += (j + 1);
                    continue a;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        new MovingCount().movingCount(1,2,1);
    }


}
