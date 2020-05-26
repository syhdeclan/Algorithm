package Year2020.January;

import java.util.LinkedList;
import java.util.List;

/**
 * @author shenyvhao
 * @program Algorithm
 * @description
 * @create 2020-01-12 21
 **/


public class DecompressRLElist {

    public int[] decompressRLElist(int[] nums) {
        List<Integer> list = new LinkedList<>();
        int c = nums.length/2;
        for (int i = 0; i < c; i++) {
            int count = nums[i*2];
            int num = nums[i*2+1];
            for (int j = 0; j < count; j++) {
                list.add(num);
            }
        }
        int arr[] = new int[list.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }

}
