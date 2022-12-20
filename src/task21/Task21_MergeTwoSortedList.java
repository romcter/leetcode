package task21;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class Task21_MergeTwoSortedList {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(
                1, new ListNode(
                        2, new ListNode(
                                4
        )
        )
        );

        ListNode listNode2 = new ListNode(
                1, new ListNode(
                3, new ListNode(
                4
        )
        )
        );

        ListNode res = mergeTwoLists(listNode1, listNode2);

        System.out.println(mergeTwoLists(listNode1, listNode2));
    }


    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        if(list1.val < list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }

//        ListNode next = list1;
//        List<Integer> res = new ArrayList<>();
//        while(next.next != null){
//           res.add(next.val);
//           next = next.next;
//        }
//        res.add(next.val);
//
//        next = list2;
//        while(next.next != null){
//            res.add(next.val);
//            next = next.next;
//        }
//        res.add(next.val);
//
//        var result = res.stream().sorted().collect(Collectors.toList());
//
//        System.out.println(result);
//
//        ListNode listNode = null;
//        for (int i = 0; i < result.size(); i++) {
//            if (listNode == null) {
//                listNode = new ListNode(result.get(i));
//                continue;
//            }
//            next = listNode;
//            while(next.next != null){
//                next = next.next;
//            }
//            next.next = new ListNode(result.get(i));
//        }
//        return listNode;
    }



    private static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}


//    You are given the heads of two sorted linked lists list1 and list2.
//
//        Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.
//
//        Return the head of the merged linked list.
//
//
//
//        Example 1:
//
//
//        Input: list1 = [1,2,4], list2 = [1,3,4]
//        Output: [1,1,2,3,4,4]
//        Example 2:
//
//        Input: list1 = [], list2 = []
//        Output: []
//        Example 3:
//
//        Input: list1 = [], list2 = [0]
//        Output: [0]
