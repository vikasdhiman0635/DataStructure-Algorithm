package Leetcode.Easy;

public class Q21 {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1, new ListNode(2, new ListNode(4, null)));

        ListNode node2 = new ListNode(1, new ListNode(3, new ListNode(4, null)));

        ListNode res = mergeTwoLists(node1, node2);
        printList(res);

    }

    public static void printList(ListNode node) {
        ListNode temp = node;
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        System.out.println("working");
        ListNode head = new ListNode(0);
        ListNode tail = head;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tail.next = list1;
                tail = tail.next;
                list1 = list1.next;

            } else {
                tail.next = list2;
                tail = tail.next;
                list2 = list2.next;
            }
        }

        while (list1 != null) {
            tail.next = list1;
            tail = tail.next;
            list1 = list1.next;
        }
        while (list2 != null) {
            tail.next = list2;
            tail = tail.next;
            list2 = list2.next;
        }

        return head.next;
    }

}

class ListNode {
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