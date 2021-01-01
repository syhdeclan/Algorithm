package Single;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author shenyvhao
 * @program Algorithm
 * @description
 * @create 2020-09-06 20
 **/


public class TencentPP1 {

    static class ListNode{
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ListNode node1 = new ListNode(0);
        ListNode p1 = node1;
        scanner.nextLine();
        String arr1Str = scanner.nextLine();
        String[] arr1Split = arr1Str.split(" ");
        for (int i = 0; i < n; i++) {
            p1.next = new ListNode(Integer.parseInt(arr1Split[i]));
            p1 = p1.next;
        }

        int m = scanner.nextInt();
        scanner.nextLine();
        ListNode node2 = new ListNode(0);
        ListNode p2 = node2;
        String arr2Str = scanner.nextLine();
        String[] arr2Split = arr2Str.split(" ");
        for (int i = 0; i < m; i++) {
            p2.next = new ListNode(Integer.parseInt(arr2Split[i]));
            p2 = p2.next;
        }

        List<Integer> res = new ArrayList<>();
        p1 = node1.next;
        p2 = node2.next;
        while (p2 != null && p1 != null) {
            if (p1.val == p2.val) {
                res.add(p1.val);
                p1 = p1.next;
                p2 = p2.next;
            } else if (p1.val > p2.val) {
                p1 = p1.next;
            } else {
                p2 = p2.next;
            }
        }

        for (int k = 0; k < res.size(); k++) {
            System.out.print(res.get(k) + " ");
        }
    }

}
