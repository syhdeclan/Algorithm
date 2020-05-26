package Year2020.April;

/**
 * @author shenyvhao
 * @program Algorithm
 * @description
 * @create 2020-04-25 09
 **/


public class MaxProfit {

    public int maxProfit(int[] prices) {
        int n = prices.length;
        if (n == 0){
            return 0;
        }
        int[] f = new int[n];
        f[0] = 0;
        int profit = 0;
        for (int i = 1; i < n; i++) {
            f[i] = Math.max(0, (f[i - 1] + prices[i] - prices[i - 1]));
            profit = Math.max(profit,f[i]);
        }
        return profit;
    }

    public static void main(String[] args) {
        System.out.println(new MaxProfit().maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }
}
