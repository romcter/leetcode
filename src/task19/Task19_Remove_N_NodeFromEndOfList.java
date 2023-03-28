package task19;

import java.util.Objects;

public class Task19_Remove_N_NodeFromEndOfList {
    public static void main(String[] args) {

//        ListNode head = new ListNode(1,
//                new ListNode(2,
//                        new ListNode(3,
//                                new ListNode(4,
//                                        new ListNode(5)))));
//        ListNode head = new ListNode(1);
        ListNode head = new ListNode(1,
                new ListNode(2));
        System.out.println(removeNthFromEnd(head, 2));
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode node = head;
        int counter = 0;
        while (node.next != null) {
            node = node.next;
            counter++;
        }
        node = head;
        if (counter >= n) {
            if(counter - n < 0)
                node = Objects.requireNonNull(node).next;
            for (int i = 0; i < counter - n; i++) {
                node = Objects.requireNonNull(node).next;
            }
            if (counter > 0)
                node.next = Objects.requireNonNull(node.next).next;
            return head;
        }
        else {
            return head.next;
        }
    }


    private static class ListNode {
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

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }

}
