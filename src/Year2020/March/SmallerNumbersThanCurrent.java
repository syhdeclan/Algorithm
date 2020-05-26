package Year2020.March;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author shenyvhao
 * @program Algorithm
 * @description
 * @create 2020-03-20 09
 **/


public class SmallerNumbersThanCurrent {

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] res = new int[nums.length];
        int[] copy = Arrays.copyOf(nums,nums.length);
        Arrays.sort(copy);
        for (int i = 0; i < res.length; i++) {
            int pos = recursionBinarySearch(copy,nums[i],0,nums.length-1);
            while (pos -1 >= 0 && copy[pos - 1] == copy[pos]){
                pos--;
            }
            res[i] = pos;
        }

        return res;
    }

    public static int recursionBinarySearch(int[] arr,int key,int low,int high){

        if(key < arr[low] || key > arr[high] || low > high){
            return -1;
        }

        int middle = (low + high) / 2;			//初始中间位置
        if(arr[middle] > key){
            //比关键字大则关键字在左区域
            return recursionBinarySearch(arr, key, low, middle - 1);
        }else if(arr[middle] < key){
            //比关键字小则关键字在右区域
            return recursionBinarySearch(arr, key, middle + 1, high);
        }else {
            return middle;
        }

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new SmallerNumbersThanCurrent().smallerNumbersThanCurrent(new int[]{3, 2, 1})));
    }

}
