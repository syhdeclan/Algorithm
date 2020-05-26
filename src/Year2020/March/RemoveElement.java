package Year2020.March;

/**
 * @author shenyvhao
 * @program Algorithm
 * @description
 * @create 2020-03-18 19
 **/


public class RemoveElement {

    public int removeElement(int[] nums, int val) {

        int last = nums.length - 1;
        for (int i = 0; i <= last; i++) {
            if (nums[i] == val){
                nums[i--] = nums[last--];
            }
        }
        return last + 1;
    }

    public static void main(String[] args) {
        int[] a = {1};
        System.out.println(new RemoveElement().removeElement(a,1));
    }
}
