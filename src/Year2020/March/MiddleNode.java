package Year2020.March;

/**
 * @author shenyvhao
 * @program Algorithm
 * @description
 * @create 2020-03-23 11
 **/


public class MiddleNode {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode middleNode(ListNode head) {

        ListNode n1 = head;
        ListNode n2 = head;
        while (n2.next != null) {
            n1 = n1.next;
            if(n2.next.next != null){
                n2 = n2.next.next;
            }else{
                n2 = n2.next;
            }
        }
        return n1;

    }

}
