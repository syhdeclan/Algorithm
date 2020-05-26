package Year2020.April;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shenyvhao
 * @program Algorithm
 * @description
 * @create 2020-04-05 22
 **/


public class Subsets {

//    List<List<Integer>> res = new ArrayList<>();
//
//    public List<List<Integer>> subsets(int[] nums) {
//        res.add(new ArrayList<>());
//        if (nums.length == 0) {
//            return res;
//        }
//        dfs(0, nums, new ArrayList<>(), 0);
//        return res;
//    }
//
//    public void dfs(int length, int[] nums, List<Integer> list, int pos) {
//        if (length == nums.length) {
//            return;
//        }
//
//        for (int i = pos; i < nums.length; i++) {
//            list.add(nums[i]);
//            res.add(new ArrayList<>(list));
//            dfs(length + 1, nums, new ArrayList<>(list), pos);
//            list.remove(list.size() - 1);
//        }
//    }

    int[] inputArray = null;
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums)
    {
        inputArray = nums;
        backtrack(0, new ArrayList<Integer>());
        return res;
    }

    private void backtrack(int i, ArrayList<Integer> tmp)
    {
        if (inputArray.length == i)
        {
            res.add(new ArrayList<>(tmp));
        }
        else
        {
            tmp.add(inputArray[i]);
            backtrack(i + 1, tmp);
            tmp.remove(tmp.size() - 1);
            backtrack(i + 1, tmp);
        }
    }

    public static void main(String[] args) {
        new Subsets().subsets(new int[]{1,2,3});
    }

}
