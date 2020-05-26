package Year2020.April;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author shenyvhao
 * @program Algorithm
 * @description
 * @create 2020-04-02 22
 **/


public class Permute {

    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        if (nums.length == 0) {
            return new ArrayList<>();
        }
        per(nums, 0, new ArrayList<>());
        return res;
    }

    public void per(int[] nums, int length, List<Integer> list) {
        if (length == nums.length) {
            res.add(new ArrayList<>(list));
            return;
        }
        List<Integer> now = new ArrayList<>(list);
        for (int i = 0; i < nums.length; i++) {
            if (!now.contains(nums[i])) {
                now.add(nums[i]);
                per(nums, length + 1, now);
                now.remove(now.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> permute = new Permute().permute(new int[]{1, 2, 3});
        for (int i = 0; i < permute.size(); i++) {
            for (int j = 0; j < permute.get(i).size(); j++) {
                System.out.print(permute.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

}
