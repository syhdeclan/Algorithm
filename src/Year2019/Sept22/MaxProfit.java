package Year2019.Sept22;

public class MaxProfit {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(new MaxProfit().maxProfit(arr));
    }

    public int maxProfit(int[] prices) {
        int total = 0;
        for (int i = 0; i < prices.length; i++) {
            int now = findMaxProfit(prices, prices[i], i);
            total += now;
            //找到下一次开始的位置
            if (total != 0) {
                for (int j = i; j < prices.length; j++) {
                    if (prices[j] == prices[i] + now) {
                        if (j < prices.length) {
                            i = j;
                            break;
                        }
                    }
                }
            }
        }

        return total;
    }

    static int findMaxProfit(int[] prices, int price, int pos) {
        if (pos + 1 < prices.length) {
            if (prices[pos] < prices[pos + 1]) {
                return findMaxProfit(prices, price, pos + 1);
            } else {
                return prices[pos] - price;
            }
        }
        return prices[pos] - price;
    }

}
