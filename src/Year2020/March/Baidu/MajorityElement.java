package Year2020.March.Baidu;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author shenyvhao
 * @program Algorithm
 * @description
 * @create 2020-03-30 23
 **/


public class MajorityElement {

//    public int majorityElement(int[] nums) {
//        Arrays.sort(nums);
//        return nums[nums.length/2];
//    }

    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.get(nums[i]) != null) {
                hashMap.put(nums[i], hashMap.get(nums[i]) + 1);
            } else {
                hashMap.put(nums[i], 1);
            }
        }
        Map.Entry<Integer, Integer> e = null;
        for (Map.Entry<Integer, Integer> entry :
                hashMap.entrySet()) {
            if (entry.getValue() > e.getValue()) {
                e = entry;
            }
        }
        return e.getKey();

    }

    public static void main(String[] args) {
        System.out.println(new MajorityElement().majorityElement(new int[]{3, 3, 4}));
    }

}
