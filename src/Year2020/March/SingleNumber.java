package Year2020.March;

import java.util.Arrays;

/**
 * @author shenyvhao
 * @program Algorithm
 * @description
 * @create 2020-03-23 09
 **/


public class SingleNumber {

    public int singleNumber(int[] nums) {

        int res = 0;
        for (int num :
                nums) {
            res = res ^ num;
        }
        return res;
    }

}
