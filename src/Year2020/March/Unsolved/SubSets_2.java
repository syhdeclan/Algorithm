package Year2020.March.Unsolved;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shenyvhao
 * @program Algorithm
 * @description 别人的写法，我自己的没出来
 * @create 2020-03-28 19
 **/


public class SubSets_2 {

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
        new Subsets().subsets(new int[]{1, 2, 3});
    }

}
