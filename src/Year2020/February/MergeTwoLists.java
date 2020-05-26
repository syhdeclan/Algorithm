package Year2020.February;

/**
 * @author shenyvhao
 * @program Algorithm
 * @description
 * @create 2020-02-11 09
 **/


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class MergeTwoLists {

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode list = new ListNode(0);
        ListNode head = list;
        while (l1 != null || l2 != null) {
            int l11 = l1 == null ? Integer.MAX_VALUE : l1.val;
            int l22 = l2 == null ? Integer.MAX_VALUE : l2.val;
            ListNode l;
            if (l11 > l22){
                l = new ListNode(l22);
                if (l2 != null){
                    l2 = l2.next;
                }
            } else{
                l = new ListNode(l11);
                if (l1 != null){
                    l1 = l1.next;
                }
            }
            head.next = l;
            head = head.next;
        }
        return list.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);
        ListNode l = mergeTwoLists(l1,l2);
        while (l != null){
            System.out.println(l.val);
            l = l.next;
        }
    }

}
