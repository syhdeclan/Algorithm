package Year2019.November;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 给定两个数组，编写一个函数来计算它们的交集。
 * <p>
 * 示例 1:
 * <p>
 * 输入: nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出: [2]
 * 示例 2:
 * <p>
 * 输入: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * 输出: [9,4]
 * 说明:
 * <p>
 * 输出结果中的每个元素一定是唯一的。
 * 我们可以不考虑输出结果的顺序。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/intersection-of-two-arrays
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */


public class Intersection {

    public static void main(String[] args) {
        int arr1[] = {1, 2, 2, 1};
        int arr2[] = {2, 2};
        int[] ret = intersection(arr1, arr2);
        for (int i = 0; i < ret.length; i++) {
            System.out.println(ret[i]);
        }
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        //方法1
//        List<Integer> ret = new LinkedList<>();
//        a:
//        for (int i = 0; i < nums1.length; i++) {
//            if (ret.contains(nums1[i])) {
//                continue;
//            }
//            for (int j = 0; j < nums2.length; j++) {
//                if (nums2[j] == nums1[i]){
//                    ret.add(nums1[i]);
//                    continue a;
//                }
//            }
//        }
//
//        int[] retA = new int[ret.size()];
//        for (int i = 0; i < ret.size(); i++) {
//            retA[i] = ret.get(i);
//        }

        //方法2
        int[] sortedNum1 = nums1;
        Arrays.sort(sortedNum1);
        List<Integer> ret = new LinkedList<>();
        for (int i = 0; i < nums2.length; i++) {
            if (ret.contains(nums2[i])){
                continue;
            }
            if(binarySearch(sortedNum1,nums2[i])){
                 ret.add(nums2[i]);
                 continue;
            }
        }

        int[] retA = new int[ret.size()];
        for (int i = 0; i < ret.size(); i++) {
            retA[i] = ret.get(i);
        }


        return retA;
    }

    public static boolean binarySearch(int ns[], int n){
        int mid,start=0,end=ns.length;
        while(start<end){
            mid=(start+end)/2;
            if(ns[mid]==n) {
                return true;
            }else if(ns[mid]>n){
                end=mid;
            }else{
                start=mid+1;
            }
        }
        return false;
    }


}
