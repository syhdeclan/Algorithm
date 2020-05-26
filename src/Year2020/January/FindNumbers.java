package Year2020.January;

/**
 * @author shenyvhao
 * @program Algorithm
 * @description
 * @create 2020-01-12 20
 **/


public class FindNumbers {


    public static void main(String[] args) {

    }

    public int findNumbers(int[] nums) {

        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i]+"".length()%2 == 0){
                count ++;
            }
        }

        return count;
    }

}
