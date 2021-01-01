package Year2020.May;

/**
 * @author shenyvhao
 * @program Algorithm
 * @description
 * @create 2020-08-23 17
 **/


public class Tiger1 {

    public static void main(String[] args) {
        ListNode head = new ListNode(12);
        head.next = new ListNode(13);
        head.next.next = new ListNode(14);
        head.next.next.next = new ListNode(15);
        head.next.next.next.next = new ListNode(16);
        head.next.next.next.next.next = new ListNode(17);
        head.next.next.next.next.next.next = new ListNode(18);

        ListNode n = method(head);
        while (n != null) {
            System.out.println(n.val);
            n = n.next;
        }
    }

    public static ListNode method(ListNode head){
        ListNode fast = head.next.next;
        ListNode slow = head.next;
        ListNode now = head;
        ListNode fastNext = fast.next;
        while (fast.next.next != null && slow.next.next != null && fastNext != null) {
            slow.next = fastNext;
            fast.next = slow;
            now.next = fast;
            slow = fast.next;
            fast = slow.next.next;
            fastNext = fast.next;
        }
        return head;
    }

}
