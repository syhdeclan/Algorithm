package Year2020.May;

/**
 * @author shenyvhao
 * @program Algorithm
 * @description
 * @create 2020-05-03 23
 **/


public class ReversePrint {

    public int[] reversePrint(ListNode head) {

        if (head == null) {
            return new int[]{};
        }

        ListNode point = head;
        int len = 1;
        while (point.next != null) {
            point = point.next;
            len ++;
        }

        int[] arr = new int[len];
        for (int i = len - 1; i >= 0; i--) {
            arr[i] = head.val;
            head = head.next;
        }

        return arr;

    }

}
