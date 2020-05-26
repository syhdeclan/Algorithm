package Year2020.March.Unsolved;

/**
 * @author shenyvhao
 * @program Algorithm
 * @description
 * @create 2020-03-30 20
 **/


public class FindMin2 {

    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;
        while (low <= high){
            mid = (high + low)/2;
            if (nums[mid] < nums[mid - 1] && nums[mid] < nums[mid + 1]){
                return nums[mid];
            }else if(nums[mid] >= nums[mid - 1]){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new FindMin2().findMin(new int[]{1,3,5}));
    }
}
