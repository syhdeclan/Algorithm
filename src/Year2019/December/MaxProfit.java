package Year2019.December;

/**
 * @author shenyvhao
 * @program Algorithm
 * @description
 * @create 2019-12-07 21
 **/


public class MaxProfit {

    public int maxProfit(int[] prices){

        int[][] arr = new int[prices.length][2];
        for (int i = 0; i < prices.length; i++) {
            arr[i][0] = getMax(0,i,prices);
            arr[i][1] = getMin(0,i,prices);
        }
        return 0;
    }

    public int getMax(int max, int i, int[] arr){
        return max > arr[i] ? max : arr[i];
    }
    public int getMin(int min, int i, int[] arr){
        return min < arr[i] ? min : arr[i];
    }

}
