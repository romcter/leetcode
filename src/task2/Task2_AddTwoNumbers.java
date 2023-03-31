package task2;

import java.math.BigInteger;

public class Task2_AddTwoNumbers {

    public static void main(String[] args) {
//        ListNode l1 = new ListNode(2,
//                new ListNode(4,
//                        new ListNode(3)));
//
//        ListNode l2 = new ListNode(5,
//                new ListNode(6,
//                        new ListNode(4)));

        ListNode l1 = new ListNode(9);

        ListNode l2 = new ListNode(1,
                new ListNode(9,
                        new ListNode(9,
                                new ListNode(9,
                                        new ListNode(9,
                                                new ListNode(9,
                                                        new ListNode(9,
                                                                new ListNode(9,
                                                                        new ListNode(9,
                                                                                new ListNode(9))))))))));

        System.out.println(addTwoNumbers(l1, l2));
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder sbL1 = new StringBuilder();
        StringBuilder sbL2 = new StringBuilder();

        ListNode listNode1 = l1;
        while (listNode1.next != null){
            sbL1.append(listNode1.val);
            listNode1 = listNode1.next;
        }
        sbL1.append(listNode1.val);

        ListNode listNode2 = l2;
        while (listNode2.next != null){
            sbL2.append(listNode2.val);
            listNode2 = listNode2.next;
        }
        sbL2.append(listNode2.val);

        BigInteger sumOfTwoListNode = new BigInteger(String.valueOf(sbL1.reverse())).add(new BigInteger(String.valueOf(sbL2.reverse())));

        String stringSum = String.valueOf(sumOfTwoListNode);

        System.out.println(stringSum);

        ListNode res = new ListNode(Integer.parseInt(String.valueOf(stringSum.charAt(stringSum.length() - 1))));



        for (int i = stringSum.length() - 2; i >= 0; i--) {
            if(res.next == null)
                res.next = new ListNode(Integer.parseInt(String.valueOf(stringSum.charAt(i))));
            else {
                ListNode next = res;
                while (next.next != null){
                    if(next.next.next == null){
                        next.next.next = new ListNode(Integer.parseInt(String.valueOf(stringSum.charAt(i))));
                        break;
                    }
                    else
                        next = next.next;
                }
            }
        }

        return res;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {}
        ListNode(int val) {this.val = val;}
        ListNode(int val, ListNode next) {this.val = val;this.next = next;}

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }
}
