package Year2021.January;

public class FindRepeatNumber {

    public int findRepeatNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i != nums[i]) {
                if (nums[i] == nums[nums[i]]){
                    return nums[i];
                }
                swap(nums,i,nums[i]);
                i--;
            }
        }
        return -1;
    }

    public void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,1,0,2,5,3};
        System.out.println(new FindRepeatNumber().findRepeatNumber(arr));
    }
}
