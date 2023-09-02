
//  Definition for singly-linked list.
public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(9);
        ListNode l2 = new ListNode(4, l1);
        ListNode l3 = new ListNode(5, l2);
//        ListNode l4 = new ListNode(9, l3);
//        ListNode l5 = new ListNode(4, l4);

        ListNode l4 = new ListNode(6);
        ListNode l5 = new ListNode(5, l4);
//
//        ListNode l = new ListNode(5, l5);

        addTwoNumbers(l3, l5);
//        System.out.println(reverseNum(100));
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int num1 = 0;

        while (l1 != null) {
            num1 = (num1 * 10) + l1.val;
            l1 = l1.next;
        }

        int num2 = 0;

        while (l2 != null) {
            num2 = (num2 * 10) + l2.val;
            l2 = l2.next;
        }

        int res = Integer.parseInt(reverseNum(num1)) + Integer.parseInt(reverseNum(num2));
        String result = String.valueOf(res);
//        System.out.println(result);
        ListNode l = null;

        for (int i = 0; i < result.length(); i++) {
            l = new ListNode(result.charAt(i) - '0', l);
        }

//        while (l !=null){
//            System.out.println(l.val);
//            l= l.next;
//        }

        return l==null?new ListNode(0):l;
    }

    public static String reverseNum(int num) {
        StringBuilder s = new StringBuilder();
        int i = num;
        while (i > 0) {
            s.append(i % 10);
            i /= 10;
        }

        return s.toString();
    }
}