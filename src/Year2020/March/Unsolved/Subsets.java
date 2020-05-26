package Year2020.March.Unsolved;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shenyvhao
 * @program Algorithm
 * @description
 * @create 2020-03-28 16
 **/


public class Subsets {

    static List<List<Integer>> res = new ArrayList<>();
    static ArrayList<Integer> numsList = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        for (int num :
                nums) {
            numsList.add(num);
        }
        ArrayList<Integer> list = new ArrayList<>();
        arrange(list, nums, 0);
        res.add(numsList);
        return res;
    }

    public void arrange(ArrayList list, int[] nums, int len) {
        if (len == 0) {
            ArrayList<Integer> newList = new ArrayList<>(list);
            res.add(newList);
            arrange(newList, nums, len + 1);
            return;
        }
        if (len == nums.length) {
            return;
        }

        ArrayList<Integer> newList = new ArrayList<>(numsList);
        newList.removeAll(list);
        for (int j = 0; j < newList.size(); j++) {
            System.out.print(newList.get(j) + " ");
        }
            System.out.println();
        for (int i = len - 1; i < newList.size(); i++) {
            ArrayList<Integer> nowList = new ArrayList<>(list);
            nowList.add(newList.get(i));
            res.add(nowList);

            arrange(nowList, nums, len + 1);
        }

    }

    public static void main(String[] args) {
        new Subsets().subsets(new int[]{1, 2, 3});
    }

}
