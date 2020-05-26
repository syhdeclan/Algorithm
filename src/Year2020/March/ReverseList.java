package Year2020.March;

/**
 * @author shenyvhao
 * @program Algorithm
 * @description
 * @create 2020-03-29 22
 **/


public class ReverseList {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode reverseList(ListNode head) {
        if (head.next == null) {
            return head;
        }
        return reverse(head.next, new ListNode(head.val));
    }

    public ListNode reverse(ListNode head, ListNode newList){
        if (head == null) {
            return newList;
        }
        ListNode node = new ListNode(head.val);
        node.next = newList;
        return reverse(head.next,node);
    }

}
