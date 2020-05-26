package Year2020.January;

/**
 * @author shenyvhao
 * @program Algorithm
 * @description
 * @create 2020-02-06 21
 **/


public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        a:
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    arr[0] = i;
                    arr[1] = j;
                    break a;
                }
            }
        }
        return arr;

    }

}
