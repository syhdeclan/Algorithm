package Year2019.November;

/**
 * 我们把符合下列属性的数组 A 称作山脉：
 * <p>
 * A.length >= 3
 * 存在 0 < i < A.length - 1 使得A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1]
 * 给定一个确定为山脉的数组，返回任何满足 A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1] 的 i 的值。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：[0,1,0]
 * 输出：1
 * 示例 2：
 * <p>
 * 输入：[0,2,1,0]
 * 输出：1
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/peak-index-in-a-mountain-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class PeakIndexInMountainArray {

    public int peakIndexInMountainArray(int[] A) {
        return peak(A, 0, A.length);
    }

    int peak(int A[], int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (A[mid] > A[mid + 1] && A[mid] > A[mid - 1]){
                return A[mid];
            }
            if (A[mid] > A[mid + 1]) {
                end = mid;
            }
            else if (A[mid] > A[mid - 1]) {
                start = mid + 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int A[] = {0, 2, 1, 0};
        System.out.println(new PeakIndexInMountainArray().peakIndexInMountainArray(A));
    }

}
