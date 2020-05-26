package Year2020.April;

import java.util.*;

/**
 * @author shenyvhao
 * @program Algorithm
 * @description
 * @create 2020-04-04 18
 **/


public class CombinationSum {

    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        back(0, candidates, target, new ArrayList<>(), 0);
        return res;
    }

    private void back(int sum, int[] candidates, int target, List<Integer> list,int pos) {
        if (sum == target) {
            res.add(new ArrayList<>(list));
            return;
        }
        if (sum > target) {
            return;
        }

        for (int i = 0; i < candidates.length; i++) {
            list.add(candidates[i]);
            back(sum + candidates[i], candidates, target, list, i);
            list.remove(list.size() - 1);
        }
    }


    public static void main(String[] args) {
        new CombinationSum().combinationSum(new int[]{1, 2}, 4);
    }

}
