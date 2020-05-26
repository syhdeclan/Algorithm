package Year2020.March;

import java.util.LinkedList;
import java.util.List;

/**
 * @author shenyvhao
 * @program Algorithm
 * @description
 * @create 2020-03-13 15
 **/

//没做出来

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new LinkedList();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                a:for (int k = j + 1; k < nums.length; k++) {
                    if ((nums[i] + nums[j] + nums[k]) == 0){
                        List list = new LinkedList();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        for (int l = 0; l < result.size(); l++) {
                            System.out.println(nums[i] + "  " + nums[j] + "  "+ nums[k]);
                            if (!list.retainAll(result.get(l))) {
                                continue a;
                            }
                        }
                        result.add(list);
                    }
                }
            }
        }
        for (int i = 0; i < result.size(); i++) {
            for (int j = 0; j < result.get(i).size(); j++) {
                System.out.print(result.get(i).get(j));
            }
            System.out.println();
        }

        return result;

    }

    public static void main(String[] args) {
        int i[] = {-1,0,1,2,-1,-4};
        new ThreeSum().threeSum(i);
    }
}
