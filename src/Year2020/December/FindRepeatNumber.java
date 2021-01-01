package Year2020.December;

/**
 * @author shenyvhao
 * @program Algorithm
 * @description
 * @create 2020-12-24 22
 **/


public class FindRepeatNumber {
    public int findRepeatNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            while (i != nums[i]){
                if (nums[i] == nums[nums[i]]){
                    return nums[i];
                }
                swap(nums,nums[i],nums[nums[i]]);
            }
        }
        return -1;
    }

    public void swap(int[] nums, int i, int j){
        int num = nums[i];
        nums[i] = nums[j];
        nums[j] = num;
    }

    public static void main(String[] args) {
        int[] arr = {4,2,3,1,0};
        System.out.println(new FindRepeatNumber().findRepeatNumber(arr));
    }

}
