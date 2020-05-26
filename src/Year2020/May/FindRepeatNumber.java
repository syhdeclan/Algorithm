package Year2020.May;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @author shenyvhao
 * @program Algorithm
 * @description
 * @create 2020-05-01 22
 **/


public class FindRepeatNumber {

    public int findRepeatNumber(int[] nums) {

        //method 1

//        int count = 0;
//        HashSet<Integer> set = new HashSet<>();
//        for (int i = 0; i < nums.length; i++) {
//            set.add(nums[i]);
//            count++;
//            if (count != set.size()) {
//                return nums[i];
//            }
//        }
//

        //method 2

//        Arrays.sort(nums);
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == nums[i + 1]){
//                return nums[i];
//            }
//        }

        //method 3

        int temp;
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != i) {
                if (nums[i] == nums[nums[i]]) {
                    return nums[i];
                }
                temp = nums[i];
                nums[i] = nums[temp];
                nums[temp] = temp;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        new FindRepeatNumber().findRepeatNumber(new int[]{2,2,1,0,2,5,3});
    }

}
