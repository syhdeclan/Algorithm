package Year2020.April;

/**
 * @author shenyvhao
 * @program Algorithm
 * @description
 * @create 2020-04-13 13
 **/


public class RemoveNthFromEnd {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy;

        while (n != 0) {
            fast = fast.next;
            n --;
        }

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return dummy.next;
    }
}
