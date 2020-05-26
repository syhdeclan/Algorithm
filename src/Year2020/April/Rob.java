package Year2020.April;

/**
 * @author shenyvhao
 * @program Algorithm
 * @description
 * @create 2020-04-24 23
 **/


public class Rob {

    public int rob(int[] nums) {

        int n = nums.length;
        int f[] = new int[n + 1];
        f[0] = 0;
        for (int i = 1; i <= n; i++) {
            f[i] = nums[i - 1];
            if (i > 1) {
                f[i] = Math.max(f[i - 1], f[i - 2] + f[i]);
            }
        }
        return f[n];

    }

}
